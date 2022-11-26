package atividadeExtra.homework.att2;

public class Gerente extends Empregado{

    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
    public Gerente() {
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
    public String getNome () {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getMatricula () {
        return super.getMatricula();
    }
    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public double getSalario () {
        return super.getSalario();
    }
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public double valorINSS(double salario){
        return super.valorINSS(10000);
    }

    //Retorna o resultado inteiro para o main
    public String toString() {
        return "Gerente\n" + "----------\n" +
                "Nome: " + super.getNome() + "\n" +
                "Idade: " + super.getIdade() + " Anos\n" +
                "Número de matrícula: " + super.getMatricula() + "\n" +
                "Nome de Gerencia: " + nomeGerencia + "\n" +
                "Valor a pagar de inss: " + valorINSS(10000);
    }
}
