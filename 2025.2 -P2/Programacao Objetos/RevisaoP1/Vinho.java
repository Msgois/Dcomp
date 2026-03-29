import java.util.Scanner;

public class Vinho {
    int qtd;
    double preco;
    public Vinho(int qtd,double preco){
        this.qtd=qtd;
        this.preco=preco;
    }
    public void total(){
        if(this.qtd>=3){
            System.out.println((this.qtd-(this.qtd/3))*this.preco);
        }else{
            System.out.println(this.qtd*this.preco);
        }
    }
}
class Teste5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd e o preco unitario");
        Vinho obj = new Vinho(Integer.parseInt(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        obj.total();
    }
}
