import java.util.Scanner;

abstract class Figura {
    private String cor = null;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return cor;
    }

    @Override
    public abstract String toString();
}

abstract class Bidimensionais extends Figura {
    private String tipo;

    public Bidimensionais(String cor) {
        super(cor);
        tipo = "Bidemensional";
    }

    public String gettipo() {
        return tipo;
    }

    public abstract double calculaArea();
}

abstract class Tridimensionais extends Figura {
    private String tipo;

    public Tridimensionais(String cor) {
        super(cor);
        tipo = "Tridemensional";
    }

    public String gettipo() {
        return tipo;
    }

    public abstract double calculaVolume();
}

class Circulo extends Bidimensionais {
    private final double pi = 3.14;
    private double raio = 0;
    private String tipo2;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
        tipo2 = "Circulo";
    }

    @Override
    public double calculaArea() {
        return pi * raio * raio;
    }

    public String gettipo2() {
        return tipo2;
    }

    @Override
    public String toString() {
        return "Cor" + getcor() + "Tipo:" + gettipo() + "Figura:" + gettipo2() + "Area:" + calculaArea();
    }
}

class Triangulo extends Bidimensionais {
    private double b = 0, h = 0;
    private String tipo2;

    public Triangulo(String cor, double b, double h) {
        super(cor);
        this.b = b;
        this.h = h;
        tipo2 = "Triangulo";
    }

    @Override
    public double calculaArea() {
        return h * b / 2;
    }

    public String gettipo2() {
        return tipo2;
    }

    @Override
    public String toString() {
        return "Cor" + getcor() + "Tipo:" + gettipo() + "Figura:" + gettipo2() + "Area:" + calculaArea();
    }
}

class Retangulo extends Bidimensionais {
    private double a = 0, b = 0;
    private String tipo2;

    public Retangulo(String cor, double a, double b) {
        super(cor);
        this.a = a;
        this.b = b;
        tipo2 = "Retangulo";
    }

    @Override
    public double calculaArea() {
        return a * b;
    }

    public String gettipo2() {
        return tipo2;
    }

    @Override
    public String toString() {
        return "Cor" + getcor() + "Tipo:" + gettipo() + "Figura:" + gettipo2() + "Area:" + calculaArea();
    }
}

class Esfera extends Tridimensionais {
    private final double pi = 3.14;
    private double raio;
    private String tipo2;

    public Esfera(String cor, double raio) {
        super(cor);
        this.raio = raio;
        tipo2 = "Esfera";
    }

    @Override
    public double calculaVolume() {
        return raio * raio * raio * pi * 4 / 3;
    }

    public String gettipo2() {
        return tipo2;
    }

    @Override
    public String toString() {
        return "Cor" + getcor() + "Tipo:" + gettipo() + "Figura:" + gettipo2() + "Volume:" + calculaVolume();
    }
}

class teste {
    public static void main(String[] args) {
        // PRIMEIRA QUESTÃO
        Circulo c1 = new Circulo("Rosa", 2.0);
        Retangulo r1 = new Retangulo("Vermelho", 10, 20);
        Triangulo t1 = new Triangulo("Amarelo", 10, 5);
        Esfera e1 = new Esfera("Preta", 12.5);
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(t1);
        System.out.println(e1);
        // Segunda Questao
        Figura[] figuras = { c1, r1, t1, e1 };
        //FOREACH
        for (Figura f : figuras) {
            //POLIMORFISMO
            //VE SE A FIGURA F É DA INSTANCIA BIDIMENSIONAIS
            if (f instanceof Bidimensionais) {
                System.out.println(((Bidimensionais) f).calculaArea());
                //VE SE A FIGURA F É DA INSTANCIA TRIDIMENSIONAL
            } else if (f instanceof Tridimensionais) {
                System.out.println(((Tridimensionais) f).calculaVolume());
            }
        }
    }
}