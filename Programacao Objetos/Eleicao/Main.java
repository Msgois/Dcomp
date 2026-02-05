package Eleicao;

import java.util.Scanner;

class RegistroCandidatos {
    Scanner sc = new Scanner(System.in);
    int sequencial = 1, candidatura;
    String nome;
    String[] ListaCandidatos;
    int[] baudevotos;

    /*
     * a ideia é colocar um array com os nomes e numeros em q cada numero/nome
     * se refira a cada nome/numero, deve da pra transformar a string em int
     */
    public RegistroCandidatos(int candidatura) {
        this.candidatura = candidatura;// Quantos candidatos Teremos.
        this.ListaCandidatos = new String[candidatura];
        this.baudevotos = new int[candidatura];

    }

    public void registrar() {
        while (sequencial != (candidatura + 1))
        /*
         * Explicando esse While: Como foi pedido pra q o numero dos candidato fosse
         * iniciado em 1 por diante, ele testa se ja todos os candidatos ja foram
         * inseridos no array
         * por meio da veridicação de se o numero sequencial é diferente do numero total
         * de candidatos
         * (candidatura+1), pq por ex: Se candidatura for 3, sequencial vai começar em
         * 1, ou seja,
         * candidato 1-- Posição 0 no array
         * candidato 2-- Posição 1 no array
         * candidato 3-- Posição 2 no array
         * Quando o 3 for lido, vai ++, ou seja, vai se transformar em 4, igualando a
         * candidatura+1 e saindo
         * do nosso querido While.
         */ {
            nome = sc.nextLine();
            System.out.println(sequencial);
            ListaCandidatos[sequencial - 1] = nome;
            sequencial++;
        }
    }
}

class UrnaEletrônica {
    Scanner sc = new Scanner(System.in);
    RegistroCandidatos registro;
    /*
     * Objeto da Classe RegistroCandidatos, permitindo o acesso a lista de nomes
     * e o baudevotos
     */
    boolean votacao = false;// A votação obviamente começa em falso pq não está ocorrendo.
    int aux, votosbrancos = 0, votosnulos = 0;

    public UrnaEletrônica(RegistroCandidatos obj) {
        /*
         * É obrigatório na criação de um objeto dessa classe passar um
         * objeto da classe
         * RegistroCandidatos para a criação de um Objeto UrnaEletrônica
         */
        this.registro = obj;
    }

    public void Iniciar() {
        votacao = true;
    }

    public void finalizar() {
        votacao = false;
    }

    public void votar() {
        if (votacao) {// Se votação == True.
            aux = sc.nextInt();// NÚMERO DO CANDIDATO A SER VOTADO
            if (aux > 0 && aux <= registro.candidatura) {
                /*
                 * Garante que o numero digitado pelo usuário seja um número
                 * válido
                 */
                this.registro.baudevotos[aux - 1] += 1;
                System.out.println(this.registro.ListaCandidatos[aux - 1]);
                /*
                 * Esse -1 nessas duas linhas acima é feito com o objetivo de arrumar a
                 * indicação para a posição do array ,já que sabemos que os numeros dos
                 * candidatos se iniciam em 1, porém a posição dos array começa em 0, ou seja,
                 * 1---0
                 */
            } else if (aux == 0) {
                votosbrancos++;// Se votou em 0, é Branco
                System.out.println("Voto em Branco");
            } else {
                votosnulos++;// Se escreveu um número Invalido, é Voto Nulo
            }
        }
    }

    public void apuracao() {
        for (int i = 0; i < this.registro.candidatura; i++) {
            /*
             * Esse for faz o papel de imprimir o nome e a quantidade
             * de votos recebidos por cada candidato
             */
            System.out.println(this.registro.ListaCandidatos[i]);
            System.out.println(this.registro.baudevotos[i]);
            System.out.println("--------------------------");
        }
        /* Impressão do total de Votos Brancos e Nulos */
        System.out.println("BRANCOS");
        System.out.println(votosbrancos);
        System.out.println("--------------------------");
        System.out.println("NULOS");
        System.out.println(votosnulos);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        RegistroCandidatos obj = new RegistroCandidatos(6);
        obj.registrar();
        UrnaEletrônica urna = new UrnaEletrônica(obj);
        urna.Iniciar();
        urna.votar();
        urna.votar();
        urna.votar();
        urna.finalizar();
        urna.apuracao();
    }
}