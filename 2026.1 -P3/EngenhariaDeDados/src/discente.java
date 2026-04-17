import java.io.*;
import java.util.*;

/* Registro discente, possuindo os atributos necessários para um discente e dois métodos.
-stringDiscente: Retorna os dados do discente em uma única string.
-imprimeDiscente: imprime os dados do discente no console.
 */
public record discente(
        String matricula,
        String nome,
        String anoIngresso,
        String periodoIngresso,
        String tipo,
        String status,
        String nivel,
        String curso,
        String modalidade,
        String unidade,
        String unidadeGestora
) {
    public String stringDiscente() {
        return "-------------------------------------------"+ "\n"+
        "Matrícula: " + matricula + "\n"+
        "Nome: " + nome + "\n"+
        "Ano de Ingresso: " + anoIngresso +"\n"+
        "Período de Ingresso: " + periodoIngresso +"\n"+
        "Unidade: " + unidade+"\n"+
        "Unidade Gestora: " + unidadeGestora+"\n"+
        "Tipo: " + tipo+"\n"+
        "Curso: " + curso+"\n"+
        "Status: " + status+"\n"+
        "Nível: " + nivel+"\n"+
       "Modalidade: " + modalidade+"\n"+ "-------------------------------------------";
    }
    public void imprimeDiscente() {
        System.out.println("-------------------------------------------");
        System.out.println("MATRÍCULA: " + matricula);
        System.out.println("NOME: " + nome);
        System.out.println("ANO DE INGRESSO: " + anoIngresso);
        System.out.println("PERÍODO INGRESSO: "+ periodoIngresso);
        System.out.println("UNIDADE: "+ unidade);
        System.out.println("UNIDADE GESTORA: "+ unidadeGestora);
        System.out.println("TIPO: "+ tipo);
        System.out.println("CURSO: "+ curso);
        System.out.println("STATUS: "+ status);
        System.out.println("NÍVEL: " + nivel);
        System.out.println("MODALIDADE: "+ modalidade);
        System.out.println("-------------------------------------------");
    }
}
/*A classe Functions contém 2 métodos estáticos
-leituraEarray: Realiza a leitura de cada linha do arquivo por meio do FileReader + BufferedReader. Utiliza-se o método .split 
com uma expressão regular (Regex) para separar as colunas; essa Regex específica permite ignorar vírgulas que estejam 
dentro de aspas, garantindo a integridade dos dados. Após o split, cada atributo é atribuído à sua respectiva coluna para 
construir um objeto discente. Como essa estrutura está inserida em um loop while, é formada uma ArrayList contendo todos 
os discentes presentes no .csv.
-escrevertxt: Realiza a criação de um arquivo txt (discentes.txt) com os dados formatados de cada um dos discentes contidos na ArrayList.
OBS: Foi usado try-with-resources (Try and Catch) em ambos os métodos para tratar possíveis problemas na abertura ou leitura dos arquivos.
OBS2: Foi implementado um IF que valida se a linha possui pelo menos 11 colunas antes de tentar instanciar o objeto, evitando erros de índice.
OBS3: O Regex utilizado `,(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)` é um Lookahead que verifica se a vírgula não está cercada por um número ímpar de aspas.
 */
class Functions{
    public static List<discente> leituraEarray(){
        List<discente> discentes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("dis-csv-discentes-de-graduacao-de-2025_1.csv"))){
            String linha;
            br.readLine();
            while((linha = br.readLine())!= null){
                String[] coluna = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                if (coluna.length >= 11) {
                    discente discente = new discente(coluna[0], coluna[1], coluna[2], coluna[3], coluna[4], coluna[5], coluna[6], coluna[7], coluna[8], coluna[9], coluna[10]);
                    discentes.add(discente);
                }
            }
            } catch (IOException e) {
            System.out.println("ERRO"+ e.getMessage());
    }
        return discentes;
        }
        public static void escrevertxt(List<discente> discentes){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("discentes.txt"))){
            for(discente discente : discentes){
                bw.write(discente.stringDiscente());
            }
        }catch(IOException e){
            System.out.println("ERRO"+ e.getMessage());
        }
        }
    }

        void main() {
            Functions.escrevertxt(Functions.leituraEarray());
        }
