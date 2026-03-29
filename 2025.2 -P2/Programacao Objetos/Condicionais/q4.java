

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a + b + c) / 3.0;
        double distA = Math.abs(a - media);
        double distB = Math.abs(b - media);
        double distC = Math.abs(c - media);
        double menorDist = distA;
        double maisProximo = a;
        if (distB < menorDist) {
            menorDist = distB;
            maisProximo = b;
        }
        if (distC < menorDist) {
            menorDist = distC;
            maisProximo = c;
        }
        System.out.println(maisProximo);
        sc.close();
    }
}
