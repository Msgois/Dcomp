import java.util.Scanner;

public class Locadora {
    int dias,km;
    public Locadora(int dias, int km) {
        this.dias = dias;
        this.km = km;
    }
    public void total(){
        if(this.dias*100 == this.km){
            System.out.println(this.dias*90);
        }else{
            System.out.println(this.dias*90+((this.km-this.dias*100)*12));
        }
    }
}
class Teste7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dias e os km");
        Locadora obj = new Locadora(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        obj.total();
    }
}