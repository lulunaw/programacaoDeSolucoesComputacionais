package atividadeExtra.homework.att1;

public class Cachorro extends Animal{
    private String raca;

    //Get - Set | Raça cachorro
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    //Get - Set | Animal-nomeCachorro
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    ////Get - Set | Animal-pesoCachorro
    @Override
    public double getPeso(){
        return super.getPeso();
    }
    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    //Constructor - Declara o valor padrão das variáveis
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    //Retorna o resultado inteiro para o main
    public String toString() {
        return "Cachorro\n" + "----------\n" + "Nome: " + super.getNome() + "\n" + "Peso: " + super.getPeso() + "Kg\n" + "Raça: " + raca;
    }
}
