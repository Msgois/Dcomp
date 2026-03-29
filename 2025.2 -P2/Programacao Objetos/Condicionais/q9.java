

import java.util.Scanner;

public class q9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        String nomeMes;
        switch (mes) {
            case 1: nomeMes = "janeiro"; break;
            case 2: nomeMes = "fevereiro"; break;
            case 3: nomeMes = "marco"; break;
            case 4: nomeMes = "abril"; break;
            case 5: nomeMes = "maio"; break;
            case 6: nomeMes = "junho"; break;
            case 7: nomeMes = "julho"; break;
            case 8: nomeMes = "agosto"; break;
            case 9: nomeMes = "setembro"; break;
            case 10: nomeMes = "outubro"; break;
            case 11: nomeMes = "novembro"; break;
            case 12: nomeMes = "dezembro"; break;
            default: nomeMes = "Mês inválido";
        }
        System.out.println(nomeMes);
        sc.close();
    }
}
