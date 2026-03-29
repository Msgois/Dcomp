

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int kmRodados = sc.nextInt();
        double valor = dias * 90.0;
        int kmPermitidos = dias * 100;
        if (kmRodados > kmPermitidos) {
            int kmExcedentes = kmRodados - kmPermitidos;
            valor += kmExcedentes * 12.0;
        }
        System.out.printf("%.2f%n", valor);
        sc.close();
    }
}
