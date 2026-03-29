import java.util.Scanner;

public class PouN {
    int numero;
    public PouN(int numero) {
        this.numero = numero;
    }
    public void ispnn(){
        if(this.numero == 0){
            System.out.println("Nulo");
        }else if(this.numero>0){
            System.out.println("Posistivo"+this.numero);
        }else{
            System.out.println("Negativo"+this.numero);
        }
    }
}
class teste2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um numero");
        PouN obj = new PouN(Integer.parseInt(sc.nextLine()));
        obj.ispnn();
    }
}
