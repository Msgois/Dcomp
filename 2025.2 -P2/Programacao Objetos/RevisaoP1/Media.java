import java.util.Scanner;

public class Media {
    double n1, n2, n3;

    public Media(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void executarmedia() {
        System.out.println((this.n1 + this.n2 + this.n3) / 3);
    }
}
    class teste1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite 3 numeros:");
            Media obj = new Media(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            obj.executarmedia();
        }
    }

