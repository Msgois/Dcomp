

import java.util.Scanner;

public class q5 {
    public static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static int diasNoMes(int mes, int ano) {
        int[] diasMes = {31, (bissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasMes[mes - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        int diaSJ = 24, mesSJ = 6;
        int dias = 0;
        boolean jaPassou = (mes > mesSJ) || (mes == mesSJ && dia > diaSJ);
        int anoFinal = jaPassou ? ano + 1 : ano;
        int d = dia, m = mes, a = ano;
        while (!(d == diaSJ && m == mesSJ && a == anoFinal)) {
            d++;
            if (d > diasNoMes(m, a)) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    a++;
                }
            }
            dias++;
        }
        System.out.println(dias);
        sc.close();
    }
}
