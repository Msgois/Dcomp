import java.util.Scanner;

public class ContaEletrica {
int kwh;
public ContaEletrica(int kwh) {
    this.kwh = kwh;
}
public void valortotal(){
    if(this.kwh<=99){
        if(this.kwh*1.35<35){
            System.out.println(35);
        }else {
            System.out.println(this.kwh * 1.35);
        }
    }else if(this.kwh>=100 || this.kwh<=299){
        System.out.println((99*1.35)+(this.kwh-99)*1.55);
    }else if(this.kwh>=300 || this.kwh<=574){
        System.out.println(((99*1.35)+(299*1.55)+(this.kwh-300-99)*1.75)*1.1);
    }else{
        System.out.println(((99*1.35)+(299*1.55)+(574*1.75)+(this.kwh-300-99-574)*2.15)*1.1);
    }
}
}
class Teste9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o kwh");
        int kwh = sc.nextInt();
        ContaEletrica obj = new ContaEletrica(kwh);
        obj.valortotal();
    }
}
