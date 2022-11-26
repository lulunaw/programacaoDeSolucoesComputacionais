package atividadeExtra.homework.att2;

public class Vendedor extends Empregado{

    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }
    public Vendedor() {
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
    public double getSalario () {
        return super.getSalario();
    }
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public String toString() {
        return "Vendedor\n" + "----------\n" +
                "Nome: " + super.getNome() + "\n" +
                "Salário: R$" + super.getSalario() + "\n" +
                "Número de vendas: " + qntVendas + "\n" +
                "Valor total das vendas: " + valorVendas;
    }
}
