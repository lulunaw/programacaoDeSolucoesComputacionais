package atividadeExtra.homework.att1;

public class Animal {
    //Variáveis privadas
    private String nome;
    private double peso;

    //Construtor - Variáveis animal deixando público
    public Animal (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    public Animal() {
    }

    //Get - Set | Nome Animal
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Get - Set | Peso Animal
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Retorna o resultado inteiro para o main
    public String toString() {
        return "Animais\n" + "----------\n" + "Nome: " + nome + "\n" + "Peso: " + peso;
    }
}
