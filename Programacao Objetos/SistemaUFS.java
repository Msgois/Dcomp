import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

enum tipodocente{
    exclusiva,substituto,parcial;
}
interface calculasalario{
double CalcularMoney();
}

abstract class funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private int anosDeServico;

    public funcionario(String nome, LocalDate dataNascimento, int anosDeServico) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anosDeServico = anosDeServico;
    }

    public String getNome() {
        return nome;
    }
    public int getAnosDeServico() {
        return anosDeServico;
    }

    public int calculaidade() {
        LocalDate dataHoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataHoje);
        return periodo.getYears();
    }
}
class docentes extends funcionario implements calculasalario {
    private ArrayList<String> disciplinas = new ArrayList();
    private tipodocente tipo;
    public docentes(String nome, LocalDate dataNascimento, tipodocente tipo, int anosDeServico) {
        super(nome, dataNascimento, anosDeServico);
        this.tipo = tipo;
    }
    public tipodocente getTipo() {
        return tipo;
    }
    @Override
    public double CalcularMoney() {
        return getAnosDeServico()*100.50;
    }
    public void adicionardisciplina(String disciplina){
        disciplinas.add(disciplina);
    }
    public void removerdisciplina(String disciplina){
        disciplinas.remove(disciplina);
    }
    public void visualizandoDisciplina(){
        for(String disciplina : disciplinas){
            System.out.println(disciplina);
        }
    }
}
class fadministrativo extends funcionario implements calculasalario {
        public fadministrativo(String nome, LocalDate dataNascimento,  int anosDeServico) {
        super(nome, dataNascimento, anosDeServico);
    }
    @Override
    public double CalcularMoney() {
        return getAnosDeServico()*100.50;
    }
}
class terceirizados extends funcionario implements calculasalario {
    private String dependencia;
    public terceirizados(String nome, LocalDate dataNascimento,  int anosDeServico, String dependencia) {
        super(nome, dataNascimento, anosDeServico);
        this.dependencia = dependencia;
    }
    @Override
    public double CalcularMoney() {
        return getAnosDeServico()*50.50;
    }
    public String getDependencia() {
        return dependencia;
    }
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
class testeUFS{
    static void main() {
        docentes schneider = new docentes("Henrique",LocalDate.of(1962,11,9),tipodocente.exclusiva,36);
        System.out.println(schneider.CalcularMoney());
        System.out.println(schneider.getTipo());
        schneider.adicionardisciplina("IES");
        schneider.adicionardisciplina("IHC");
        schneider.removerdisciplina("IHC");
        schneider.adicionardisciplina("INTERFACEHUMANOCOMPUTADOR");
        schneider.visualizandoDisciplina();
        docentes bispo = new docentes("Kalil",LocalDate.of(1990,01,12),tipodocente.exclusiva,14);
        System.out.println(bispo.CalcularMoney());
        System.out.println(bispo.getTipo());
        docentes pablo = new docentes("Pablo",LocalDate.of(1999,02,03),tipodocente.substituto,2);
        System.out.println(pablo.CalcularMoney());
        System.out.println(pablo.getTipo());
        terceirizados joquinha = new terceirizados("Joquinha",LocalDate.of(1967, 8,11),15,"SAOCRISTOVAO");
        System.out.println(joquinha.getDependencia());
        joquinha.setDependencia("ITABAIANINHA");
        System.out.println(joquinha.CalcularMoney());
        System.out.println(joquinha.getDependencia());

    }
}


