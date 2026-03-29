import java.util.Scanner;

public class FaheGrau {
    int temp;
    int escolha;
    public FaheGrau(int temp,int escolha){
        this.temp=temp;
        this.escolha=escolha;
    }
    public void FpG(){
        System.out.println((this.temp-32)*5/9);
    }
    public void GpF(){
        System.out.println((this.temp*9/5)+32);
    }
    public void escolha(){
        switch(this.escolha){
            case 1: FpG();break;
            case 2: GpF();break;
        }
    }
}
class Teste4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Temperatura e qual sera a transformacao 1-FpG e 2-GpF");
        FaheGrau obj = new FaheGrau(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        obj.escolha();

    }
}
