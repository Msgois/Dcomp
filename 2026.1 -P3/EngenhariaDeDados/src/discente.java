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
-leituraEarray: Realiza a leitura de cada linha do array por meio do FileReader + BufferedReader, utiliza-se o .slipt para
separar cada coluna, após isso adiciona-se cada respectivo atributo a sua coluna atríbuida, construindo um objeto discente.
Como essa estrutura está inserida em um loop While, é formada um arrayList contendo cada discente presente no .csv.
-escrevertxt: Realiza a criação de um arquivo txt(discentes.txt) com os dados de cada um dos discentes contidos na arraylist.
OBS:Foi usado try and Catch em ambos os métodos para o caso de que se ocorresse algum problema na abertura do arquivo .csv
OBS2:Coloquei um if determinando que somente os discentes com 11 colunas no arquivo serão adicionados no arrayList.
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