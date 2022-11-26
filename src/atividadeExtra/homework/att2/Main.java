package atividadeExtra.homework.att2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        //Declaração de classes para retorno de resultados
        Pessoa resultCliente = new Cliente("Gabriela Brandão", 22, "Feminino", 5000,2000);
        Pessoa resultVendedor = new Vendedor("Henrique Sant'anna",18, "Masculino", 2000, "422222693", 5000,20);
        Pessoa resultGerente = new Gerente("Cassimiro Santos", 19, "Masculino", 10000, "42222278126", "Fernanda Evaristo");

        //Seleção de opções na tela - Menu
        System.out.println("Informações sobre quem você gostaria de ver?");
        System.out.println("1 = Cliente");
        System.out.println("2 = Vendedor");
        System.out.println("3 = Gerente");
        System.out.println("4 = Todos os anteriores");
        select = input.nextInt();
        System.out.println(" ");

        //Validação de resultado
         while (select < 1 || select > 4){
            System.out.println("Você digitou um número inválido");
            System.out.println("As opções são:");
            System.out.println("1 = Cliente");
            System.out.println("2 = Vendedor");
            System.out.println("3 = Gerente");
            System.out.println("4 = Todos os anteriores");
            select = input.nextInt();
            System.out.println(" ");
        }

        switch (select) {
            case 1:
                System.out.println(resultCliente.toString());
                break;
            case 2:
                System.out.println(resultVendedor.toString());
                break;
            case 3:
                System.out.println(resultGerente.toString());
                break;
            case 4:
                System.out.println(resultCliente.toString());
                System.out.println(" ");
                System.out.println(resultVendedor.toString());
                System.out.println(" ");
                System.out.println(resultGerente.toString());
                break;
        }
    }
}
/*do {
            System.out.println("Você digitou um número inválido");
            System.out.println("As opções são:");
            System.out.println("1 = Cliente");
            System.out.println("2 = Vendedor");
            System.out.println("3 = Gerente");
            System.out.println("4 = Todos os anteriores");
            select = input.nextInt();
            System.out.println(" ");
            }*/