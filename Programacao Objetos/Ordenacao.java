import java.util.*;

public class Ordenacao {

    //Primeiro é o modificador de acesso(PUBLIC)
    //<T> Está dizendo q o metodo não tem um tipo pré definido, será informado ao compilar
    //<T extends Comparable<T>> o extends está dizendo q o meu tipo T(indefinido) necessita implementar a interface Comparable
    //A interface Comparable da acesso ao objeto ao metodo .compareTo(), ele permite ver se algo está em ordem, alfabetica,numerica
    //etc...
    //boolean é o retorno do metodo, poderia ser void ou qualquer outra coisa
    //T[]t é o parametro que iremos precisar passar
    public static <T extends Comparable<T>> boolean verificarordenacao(T[] t) {

        if (t == null || t.length <= 1) {
            return true;//Pois um array nulo ou de tamanho 1 já é considerado ordenado
        }
        for(int i = 0; i < t.length - 1; i++) {
            /*Como o compareTo funciona
             * IMAGINE OBJ A E OBJ B
             * SE A VEM ANTES DE B, O RESULTADO É NEGATIVO
             * SE A É IGUAL B, O RESULTADO É 0
             * SE A VEM DPS DE B, A É MAIOR
             * Como estamos analisando se é ascendente a ordem, usamos >0, pois se a ordem é ascendente
             * o valor anterior não pode ser maior que o seu sucessor*/

            if (t[i].compareTo(t[i + 1]) > 0) {
                return false;
            }
        }
                return true;
    }
    static class Carro implements Comparable<Carro> {
        String marca;
        String modelo;
        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
        @Override
        public int compareTo(Carro carro) {
            return this.marca.compareTo(carro.marca);
        }
    }
    static class Laptop implements Comparable<Laptop> {
        String modelo;
        Integer memoria;
        public Laptop(String modelo, Integer memoria) {
            this.modelo = modelo;
            this.memoria = memoria;
        }
        @Override
        public int compareTo(Laptop laptop) {
            return this.memoria.compareTo(laptop.memoria);
        }
    }

    static void main() {
        Laptop[]  laptops = {new Laptop("ASUS ROG",16),new Laptop("Acer Spire",32),new Laptop("Acer Nitro5",32) };
        Carro[] carros ={new Carro("Ferrari","PuroSangue"),new Carro("Ferrari","Spider"),new Carro("Zeekr","Y")};
        System.out.println(verificarordenacao(carros));
        System.out.println(verificarordenacao(laptops));
    }
}

