//16. Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.
package modulos.modulo5;
import java.util.Scanner;
public class Atividade8
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variáveis
        int n, maior, menor, i;
        //Pergunta
        System.out.println("Digite a nota do 1° aluno");
        n = input.nextInt();
        //Processo
        menor = n;
        maior = n;

        for (i=2; i<=10;i++) {
            if (n < menor) {
                menor = n;
                //Pergunta
                System.out.println("Digite a nota do " + i + "° aluno");
                n = input.nextInt();
            }else if (n > maior) {
                maior = n;
                //Pergunta
                System.out.println("Digite a nota do " + i + "° aluno");
                n = input.nextInt();
            }else {
                //Pergunta
                System.out.println("Digite a nota do " + i + "° aluno");
                n = input.nextInt();
            }
        }
        /*Retorno de resultados*/
        System.out.println("A menor nota é " + menor);
        System.out.println("A maior nota é " + maior);
    }
}
