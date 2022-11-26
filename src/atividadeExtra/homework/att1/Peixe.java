package atividadeExtra.homework.att1;

public class Peixe extends Animal{
    private String tipoHabitat;

//Get - Set | Habitat Peixe
    public String getTipoHabitat() {
        return tipoHabitat;
    }
    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    //Get - Set | Animal-nomePeixe
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    ////Get - Set | Animal-pesoPeixe
    @Override
    public double getPeso(){
        return super.getPeso();
    }
    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    //Constructor - Declara o valor padrão das variáveis
    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    //Retorna o resultado inteiro para o main
    public String toString() {
        return "Peixes\n" + "----------\n" + "Nome: " + super.getNome() + "\n" + "Peso: " + super.getPeso() + "Kg\n" + "Habitat: " + tipoHabitat;
    }
}
