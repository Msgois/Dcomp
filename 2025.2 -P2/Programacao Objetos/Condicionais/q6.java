

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = sc.nextDouble();
        double valor = 0;
        if (consumo > 574) {
            valor += (consumo - 574) * 2.15;
            consumo = 574;
        }
        if (consumo > 299) {
            valor += (consumo - 299) * 1.75;
            consumo = 299;
        }
        if (consumo > 99) {
            valor += (consumo - 99) * 1.55;
            consumo = 99;
        }
        valor += consumo * 1.35;
        if (consumo > 300) {
            valor *= 1.10;
        }
        if (valor < 35.0)
            valor = 35.0;
        System.out.printf("%.2f%n", valor);
        sc.close();
    }
}
