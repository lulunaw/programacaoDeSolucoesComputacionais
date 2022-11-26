package atividadeExtra.homework.att2;

public class Pessoa {
    //Variáveis privadas
    private String nome;
    private String sexo;
    private int idade;

    public Pessoa (String nome, int idade, String sexo ) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa () {
    }

    //Get - Set | Nome Pessoa
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Get - Set | Sexo Pessoa
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Get - Set | Idade Pessoa
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
