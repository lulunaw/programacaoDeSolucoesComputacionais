package atividadeExtra.homework.att2;

public class Empregado extends Pessoa{

    private double salario;
    private String matricula;
    //private double inss;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        //.inss = inss
        this.salario = salario;
        this.matricula = matricula;
    }
    public Empregado() {
    }

    @Override
    public int getIdade () {
        return super.getIdade();
    }
    @Override
    public void setIdade(int Idade) {
        super.setIdade(Idade);
    }

    @Override
    public String getSexo () {
        return super.getSexo();
    }
    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    @Override
    public String getNome () {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorINSS(double salario){
        return (salario * 0.11);
    }
}
