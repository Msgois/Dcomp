
import java.util.*;

public static class LeitorDeNomes {
    public static List<String> leitorDeNomes() {
        List<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            lista.add(nome);
        }
        return lista;
    }

    public static void leitorDuplicados(List<String> lista) {
        //O set HashSet não deixa elementos duplicados em sua lista, se tentar add um nome já presente, o metodo add
        //vai retornar false, e vice-versa
        Set<String> listaDuplicados = new HashSet<>();
        Set<String> listaDistintos = new HashSet<>();
        for (String nome : lista) {
            if (!listaDistintos.add(nome)) {
                listaDuplicados.add(nome);
            }
        }
        System.out.println("Lista duplicadas:");
        System.out.println(listaDuplicados);
        Set<String> listasemDuplicados = new HashSet<>(lista);
        listasemDuplicados.removeAll(listaDuplicados);
        System.out.println("listasem duplicados:");
        System.out.println(listasemDuplicados);
    }
    public static void taounaota(List<String> lista1, List<String> lista2) {
        List<String> lista = new ArrayList<>();
        for(String nome : lista1) {
            if(!lista2.contains(nome)) {
                lista.add(nome);
            }
        }
        for(String nome : lista2) {
            if(!lista1.contains(nome)) {
                lista.add(nome);
            }
        }
        System.out.println(lista);
    }
    public static void imprimirfrequenciaduplicados(List<String> lista) {
        //O map Hash map vai fazer o seguinte, cada key(String), vai ser ligada a um valor(Integer)
        //esse valor no caso é a frequencia de aparição de um nome
        //Map.entry representa um alinha completa da tabela key+valor
        //entry.getKey() pega a chave
        //entry.getValue() pega o valor
        //entry.set(), pegue todas as linhas do map e coloque numa lista para q eu possa ler linha por linha
        Map<String, Integer> mapa = new HashMap<>();
    }
}

static void main() {
    List<String> lista = LeitorDeNomes.leitorDeNomes();
    System.out.println(lista);
    List<String> Listinha = new ArrayList<>(List.of("Maiara","Antonio","Osvaldo","Lola","Luiza","Bianca"));
    List<String> Listinha2 = new ArrayList<>(List.of("Maria","Anlio","Paulo","Tadeu","Luiza","Bianca"));
    LeitorDeNomes.leitorDuplicados(Listinha);
    LeitorDeNomes.taounaota(Listinha,Listinha2);
}