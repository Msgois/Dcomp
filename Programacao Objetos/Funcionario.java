
import java.util.Scanner;

public class Funcionario {
    int idade;
    String nome;
    double[] salario;

    public void imprimirFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double i : salario) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Pedrinho";
        f1.salario = new double[] { 5000, 4950.90, 7000 };
        f1.idade = 27;

        f1.imprimirFuncionario();
    }
}