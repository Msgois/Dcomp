
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int livros = sc.nextInt();
        int alunos = sc.nextInt();
        double razao = (double) alunos / livros;
        char conceito;
        if (razao <= 8)
            conceito = 'A';
        else if (razao <= 12)
            conceito = 'B';
        else if (razao <= 18)
            conceito = 'C';
        else
            conceito = 'D';
        System.out.println(conceito);
        sc.close();
    }
}

