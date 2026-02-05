package SisTelefonico;

import java.util.Scanner;
import java.util.ArrayList;

class Contato {
    int telefone;
    String nome;

    public Contato(int telefone, String nome) {
        this.telefone = telefone;
        this.nome = nome;

    }
}

class SistemaTelefonico {
    Scanner sc = new Scanner(System.in);
    Contato contato;
    ArrayList<Integer> telefones = new ArrayList<>();
    ArrayList<String> nomes = new ArrayList<>();

    public SistemaTelefonico() {
    }

    int i = 0;

    public void cadastrar(Contato contato) {
        System.out.println("Cadastro do Contato" + i + "\nPrimeiro Digite o nome e dps o numero");
        if (!nomes.contains(contato.nome)) {
            nomes.add(contato.nome);
            telefones.add(contato.telefone);
            i++;
        } else {
            System.out.println("ERRO");
        }
    }

    public void remover(Contato contato) {
        nomes.remove(contato.nome);
        telefones.remove(contato.telefone);
    }

    int x = 0, indice = 0, newnumero = 0;
    String newname;

    public void atualizar(Contato contato) {
        System.out.println("Digite 0 caso queira alterar o nome ou Digite 1 caso queira alterar o numero");
        x = sc.nextInt();
        indice = nomes.indexOf(contato.nome);
        switch (x) {
            case 0:
                System.out.println("Digite o novo nome");
                newname = sc.nextLine();
                nomes.set(indice, newname);
            case 1:
                System.out.println("Digite o novo numero");
                newnumero = sc.nextInt();
                telefones.set(indice, newnumero);

        }
    }

    public void pesquisa(String nome) {
        if (nomes.contains(nome)) {
            indice = nomes.indexOf(nome);
            System.out.println("O numero e" + telefones.get(indice));
        } else {
            System.out.println("ERRO");
        }

    }

    public static void main(String[] args) {
        Contato c1 = new Contato(89089999, "Samara");
        Contato c2 = new Contato(89089782, "Mãe");
        Contato c3 = new Contato(89023231, "Pai");

        SistemaTelefonico sistema = new SistemaTelefonico();
        sistema.cadastrar(c1);
        sistema.cadastrar(c3);
        sistema.cadastrar(c2);

    }
}