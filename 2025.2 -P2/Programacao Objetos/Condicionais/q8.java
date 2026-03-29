

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                dias = bissexto ? 29 : 28;
                break;
            default:
                dias = -1;
        }
        if (dias == -1)
            System.out.println("Mês inválido");
        else
            System.out.println(dias);
        sc.close();
    }
}
