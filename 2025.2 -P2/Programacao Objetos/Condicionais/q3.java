

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a + b + c) / 3.0;
        int cont = 0;
        if (a > media) cont++;
        if (b > media) cont++;
        if (c > media) cont++;
        System.out.println(cont);
        sc.close();
    }
}
