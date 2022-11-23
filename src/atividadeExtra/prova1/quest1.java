package atividadeExtra.prova1;
import java.util.Scanner;
public class quest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variáveis
        int vitorias = 0;
        String check;

        //Array
        String[] lutas = new String[]{"Chunli", "Zanguief", "Blanka", "Guile", "Ryu", "Dhalsim"};

        //Tela de luta
        System.out.println("Você selecionou 'Ken' para esse desafio");
        System.out.println("Preparado?");
        System.out.println("Digite 'ok' para continuar");
        check = input.nextLine();

        for (int i = 0; i < 6; i++) {
            System.out.println("Seu " + (i + 1) + "° adversario: " + lutas[i]);
        }

        //Tela final
        System.out.println();
        System.out.println("Você concluiu todas as lutas");
        System.out.println("Quantos adversários você venceu?");
        vitorias = input.nextInt();

        //Retorno de resultados
        if (vitorias == 6) {
            System.out.println();
            System.out.println("Parabéns! Você derrotou todos os oponentes");
            System.out.println("Agora chegou a hora dos Bosses, se prepare!");
        } else {
            System.out.println();
            System.out.println("Que pena, você não derrotou todos os adversários");
            System.out.println("Insira uma nova ficha para recomeçar");
            System.out.println(" '...Insira aqui uma nova ficha...' ");
        }
    }
}
