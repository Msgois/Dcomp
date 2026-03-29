import java.util.Scanner;


public class DescontoIdoso {
    int idade;
    double ingresso;

    public DescontoIdoso(int idade, double ingresso){
        this.idade = idade;
        this.ingresso = ingresso;
    }
    public void valoraserpago(){
        if(this.idade>60 || this.idade<=18){
            System.out.printf("O valor a ser pago e:"+ this.ingresso*0.5);
        }else{
            System.out.printf("O valor a ser pago e:"+ this.ingresso*0.9);
        }
    }
}
class teste3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite a idade o valor do ingresso");
        DescontoIdoso obj = new DescontoIdoso(Integer.parseInt(sc.nextLine()),Double.parseDouble(sc.nextLine()));
    obj.valoraserpago();

    }
}
