import javax.xml.stream.events.StartDocument;
import java.sql.SQLOutput;
import java.util.Scanner;

public class IsParouImpar {
  int numero; //Atributo

    public IsParouImpar(int numero) { //Construtor
    this.numero = numero;
  }
  public void verificar(){ //Metodo
        if(this.numero%2==0){
           System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
  }
}
class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(sc.nextLine());
        IsParouImpar obj = new IsParouImpar(numero);
        obj.verificar();
        sc.close();
    }
}
