//Faça um programa que receba as 2 notas de 3 alunos, e para cada aluno, imprima sua média.
package modulos.modulo5;
import java.util.Scanner;
public class Atividade7
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis
        int n1, n2, media, i;


        for (i = 1; i <= 3; i++) {
            //Perguntas
            System.out.println("Qual a primeira nota do " + i + "° aluno?");
            n1 = input.nextInt();
            System.out.println("Qual a segunda nota do " + i + "° aluno?");
            n2 = input.nextInt();
            //Contas
            media = (n1 + n2) / 2;
            //Retorno de resultados
            System.out.println("A média do " + i + "° aluno é de " + media);
        }
    }
}
