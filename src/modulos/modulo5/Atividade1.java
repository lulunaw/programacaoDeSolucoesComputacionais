//9. Faça um programa que leia 10 números inteiros, e que exiba o maior e o menor número digitados.

package modulos.modulo5;
import java.util.Scanner;
public class Atividade1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, maior, menor, i;
        
        System.out.println("Digite um número");
        n = input.nextInt();
        
        menor = n;
        maior = n;
        
        for (i=2; i<=10;i++) {
            if (n < menor) {
                menor = n;
                System.out.println("Digite um número");
                n = input.nextInt();
            }else if (n > maior) {
                maior = n;
                System.out.println("Digite um número");
                n = input.nextInt();
            }else {
                System.out.println("Digite um número");
                n = input.nextInt();   
            }
        }
        /*Retorno de resultados*/
            System.out.println("O menor número é " + menor);
            System.out.println("O maior número é " + maior);
    }
}
