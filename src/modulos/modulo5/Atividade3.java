/*11. Faça um programa que leia dois números inteiros que imprima a potência do primeiro elevado ao segundo, utilizando somente
operações de multiplicação*/
package modulos.modulo5;
import java.util.Scanner;
public class Atividade3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, p1, i;
        System.out.println("Informe o número a ser elevado");
        n1 = input.nextInt();
        System.out.println("Informe quantas vezes elevar");
        n2 = input.nextInt();

        p1 = n1;

        for (i=2; i<=n2;i++) {
            p1 = p1 * n1;
        }

        /*Retorno de resultados*/
        System.out.printf("O número " + n1 + " elevado a " + n2 + " é igual a " + p1);
    }
}
