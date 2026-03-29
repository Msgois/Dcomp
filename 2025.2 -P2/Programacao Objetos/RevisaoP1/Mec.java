import java.util.Scanner;

public class Mec {
    int alunos, livros;

    public Mec(int alunos, int livros) {
        this.alunos = alunos;
        this.livros = livros;
    }

    public void conceito() {
        if (this.alunos / this.livros <= 8) {
            System.out.println("A");
        } else if (this.alunos / this.livros >= 9 && this.alunos / this.livros <= 12) {
            System.out.println("B");
        } else if (this.alunos / this.livros >= 13 && this.alunos / this.livros <= 18) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
class Teste6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de alunos e os livros");
        Mec obj = new Mec(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        obj.conceito();
    }
}
