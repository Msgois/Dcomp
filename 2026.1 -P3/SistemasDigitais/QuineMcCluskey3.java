import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class QuineMcCluskey3 {

    // Classe para representar cada termo/mintermo
    public static class Termo {
        String bin;
        boolean usado;
        boolean ehDontCare; // Flag para rastrear se veio de um 'don't care'

        public Termo(String bin, boolean ehDontCare) {
            this.bin = bin;
            this.usado = false;
            this.ehDontCare = ehDontCare;
        }
    }

    // Função robusta inspirada no comportamento do Espresso (.pla)
    public static ArrayList<Termo> lerArquivoPLA(String caminhoArquivo) {
        ArrayList<Termo> mintermosAtivos = new ArrayList<>();

        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));

            for (String linhaOriginal : linhas) {
                String linha = linhaOriginal.trim();

                // Ignora comentários ou linhas vazias
                if (linha.isEmpty() || linha.startsWith("#")) {
                    continue;
                }

                // Ignora metadados de cabeçalho (.i, .o, .p, .e, .ilb, .ob) de forma segura
                if (linha.startsWith(".")) {
                    if (linha.equalsIgnoreCase(".e") || linha.equalsIgnoreCase(".end")) {
                        break;
                    }
                    continue;
                }

                String[] partes = lineSplit(linha);

                if (partes.length >= 2) {
                    String combinacaoBinaria = partes[0];
                    String valorSaida = partes[1];

                    char primeiraSaida = valorSaida.charAt(0);

                    if (primeiraSaida == '1') {
                        mintermosAtivos.add(new Termo(combinacaoBinaria, false));
                    } else if (primeiraSaida == '-') {
                        mintermosAtivos.add(new Termo(combinacaoBinaria, true));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro .pla: " + e.getMessage());
        }

        return mintermosAtivos;
    }

    private static String[] lineSplit(String linha) {
        return linha.split("\\s+");
    }

    // Compara dois termos. Se mudar apenas 1 bit, retorna a string combinada com '-'
    public static String combinar(Termo t1, Termo t2) {
        int diferencas = 0;
        StringBuilder proximoTermo = new StringBuilder();

        for (int i = 0; i < t1.bin.length(); i++) {
            if (t1.bin.charAt(i) != t2.bin.charAt(i)) {
                if (t1.bin.charAt(i) == '-' || t2.bin.charAt(i) == '-') {
                    return null;
                }
                diferencas++;
                proximoTermo.append('-');
            } else {
                proximoTermo.append(t1.bin.charAt(i));
            }
        }

        if (diferencas == 1) {
            t1.usado = true;
            t2.usado = true;
            return proximoTermo.toString();
        }

        return null;
    }

    // Função auxiliar que verifica se um Implicante Primo cobre um mintermo original
    public static boolean corresponde(String primo, String mintermo) {
        for (int i = 0; i < primo.length(); i++) {
            if (primo.charAt(i) != '-' && primo.charAt(i) != mintermo.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String caminhoDoArquivo = "ex04_funcao6var.pla"; 

        System.out.println("--- Algoritmo de Quine-McCluskey (Estilo Espresso) ---\n");
        System.out.println("A carregar mintermos de: " + caminhoDoArquivo);

        ArrayList<Termo> mintermosOriginais = lerArquivoPLA(caminhoDoArquivo);

        if (mintermosOriginais.isEmpty()) {
            System.out.println("Nenhum mintermo ativo (1 ou -) encontrado. Verifica o ficheiro.");
            return;
        }

        // Separa apenas os mintermos estritamente ativos (saída 1) que precisam de cobertura obrigatória
        ArrayList<String> mintermosParaCobrir = new ArrayList<>();
        for (Termo t : mintermosOriginais) {
            if (!t.ehDontCare) {
                mintermosParaCobrir.add(t.bin);
            }
        }

        ArrayList<Termo> listaAtual = new ArrayList<>(mintermosOriginais);
        ArrayList<Termo> implicantesPrimos = new ArrayList<>();
        boolean houveCombinacao = true;
        int passo = 1;

        // --- FASE 1: Agrupamento Exaustivo ---
        while (houveCombinacao) {
            houveCombinacao = false;
            ArrayList<Termo> proximaRodada = new ArrayList<>();
            HashSet<String> termosInseridos = new HashSet<>(); 

            System.out.println("\n--- Etapa " + passo + ": Combinando termos ---");
            for (int i = 0; i < listaAtual.size(); i++) {
                for (int j = i + 1; j < listaAtual.size(); j++) {
                    String resultado = combinar(listaAtual.get(i), listaAtual.get(j));
                    
                    if (resultado != null) {
                        houveCombinacao = true;
                        if (!termosInseridos.contains(resultado)) {
                            boolean ambosDontCare = listaAtual.get(i).ehDontCare && listaAtual.get(j).ehDontCare;
                            proximaRodada.add(new Termo(resultado, ambosDontCare));
                            termosInseridos.add(resultado);
                            System.out.println("  " + listaAtual.get(i).bin + " + " + listaAtual.get(j).bin + " -> " + resultado);
                        }
                    }
                }
            }

            for (Termo termo : listaAtual) {
                if (!termo.usado && !termo.ehDontCare) {
                    implicantesPrimos.add(termo);
                }
            }

            if (houveCombinacao) {
                listaAtual = proximaRodada;
                passo++;
            }
        }

        // --- FASE 2: Tabela de Cobertura (Eliminação de Redundâncias) ---
        ArrayList<String> solucaoMinima = new ArrayList<>();
        HashSet<String> cobertos = new HashSet<>();

        // 1. Encontra os Implicantes Primos Essenciais
        for (String mint : mintermosParaCobrir) {
            Termo unicoCobridor = null;
            int contagemCobridores = 0;

            for (Termo primo : implicantesPrimos) {
                if (corresponde(primo.bin, mint)) {
                    contagemCobridores++;
                    unicoCobridor = primo;
                }
            }

            // Se apenas um primo cobre este mintermo, ele é ESSENCIAL
            if (contagemCobridores == 1 && unicoCobridor != null) {
                if (!solucaoMinima.contains(unicoCobridor.bin)) {
                    solucaoMinima.add(unicoCobridor.bin);
                    // Atualiza quais mintermos este essencial cobre
                    for (String m : mintermosParaCobrir) {
                        if (corresponde(unicoCobridor.bin, m)) {
                            cobertos.add(m);
                        }
                    }
                }
            }
        }

        // 2. Cobertura do restante (Gula / Solução para mintermos cíclicos ou secundários)
        while (cobertos.size() < mintermosParaCobrir.size()) {
            Termo melhorPrimo = null;
            int maxNovasCoerturas = 0;

            for (Termo primo : implicantesPrimos) {
                if (solucaoMinima.contains(primo.bin)) continue;

                int novasCoerturas = 0;
                for (String m : mintermosParaCobrir) {
                    if (!cobertos.contains(m) && corresponde(primo.bin, m)) {
                        novasCoerturas++;
                    }
                }

                if (novasCoerturas > maxNovasCoerturas) {
                    maxNovasCoerturas = novasCoerturas;
                    melhorPrimo = primo;
                }
            }

            if (melhorPrimo != null) {
                solucaoMinima.add(melhorPrimo.bin);
                for (String m : mintermosParaCobrir) {
                    if (corresponde(melhorPrimo.bin, m)) {
                        cobertos.add(m);
                    }
                }
            } else {
                break; // Evita loop infinito caso algum termo não possa ser coberto
            }
        }

        // --- 3. Imprime o Output OTIMIZADO e SEM redundâncias ---
        System.out.println("\n============================================");
        System.out.println("--- IMPLICANTES PRIMOS OTIMIZADOS (Espresso) ---");
        System.out.println("============================================");
        for (String termoMinimizado : solucaoMinima) {
            System.out.println(termoMinimizado + " 1");
        }
    }
}