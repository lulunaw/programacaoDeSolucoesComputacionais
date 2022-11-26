package atividadeExtra.homework.att2;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }
    public Cliente () {
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

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //Retorna o resultado inteiro para o main
    public String toString() {
        return "Cliente\n" + "----------\n" +
                "Nome: " + super.getNome() + "\n" +
                "Idade: " + super.getIdade() + " Anos\n" +
                "Sexo: " + super.getSexo() + "\n" +
                "Saldo devedor: " + valorDivida + "\n" +
                "Ano de nascimento: " + anoNascimento;
    }
}