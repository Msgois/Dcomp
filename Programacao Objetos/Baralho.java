import java.util.*;

class Carta implements Comparable<Carta>{
    String naipe;
    Integer valor;
    public Carta(String naipe, Integer valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
    public int compareTo(Carta o) {
        return this.valor.compareTo(o.valor);
    }
}
public class Baralho {
public static List<Carta> embaralho(List<Carta> lista,int m, int n)
}
