
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoPao = 4.50;
        double precoLeite = 5.30;
        double precoVinho = 25.00;
        double pesoPao = sc.nextDouble();
        int litrosLeite = sc.nextInt();
        int garrafasVinho = sc.nextInt();
        double valorPao = pesoPao * precoPao;
        double descontoPao = 0;
        if (pesoPao >= 1.0) {
            descontoPao = valorPao * 0.05;
        }
        double valorLeite = litrosLeite * precoLeite;
        int litrosComDesconto = litrosLeite / 3;
        double descontoLeite = litrosComDesconto * precoLeite * 0.10;

        double valorVinho = garrafasVinho * precoVinho;
        int garrafasGratis = garrafasVinho / 3;
        double descontoVinho = garrafasGratis * precoVinho;

        double total = valorPao + valorLeite + valorVinho
                     - (descontoPao + descontoLeite + descontoVinho);
        if (valorPao > 0)
            System.out.printf("Pão --------------------- R$ %.2f%n", valorPao);
        if (descontoPao > 0)
            System.out.printf("Desconto no pão --------- R$-%.2f%n", descontoPao);

        if (valorLeite > 0)
            System.out.printf("Leite ------------------- R$ %.2f%n", valorLeite);
        if (descontoLeite > 0)
            System.out.printf("Desconto no leite ------- R$-%.2f%n", descontoLeite);

        if (valorVinho > 0)
            System.out.printf("Vinho ------------------- R$ %.2f%n", valorVinho);
        if (descontoVinho > 0)
            System.out.printf("Desconto no vinho ------- R$-%.2f%n", descontoVinho);
            
        System.out.printf("Valor Total ------------- R$ %.2f%n", total);
        sc.close();
    }
}
