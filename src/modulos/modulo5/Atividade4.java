//12. Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado.
package modulos.modulo5;
import java.util.Scanner;
public class Atividade4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nl, n,  i;
        System.out.println("Informe um número limite");
        nl = input.nextInt();

        n = 1;

        /*Retorno de resultados*/
        System.out.printf("Os números ímpares até " + nl + " são ");

        for (i=0; i<=nl; i++) {
            if (n % 2 == 0) {
                n = i;
                System.out.print(n + " ");
            } else{
                n = i;
            }
        }
    }
}
