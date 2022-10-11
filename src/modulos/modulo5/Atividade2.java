//10. Faça um programa que leia um número e que calcule e imprima o fatorial deste número.
package modulos.modulo5;
import java.util.Scanner;
public class Atividade2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, soma, i;
        
        System.out.println("Digite um número");
        n = input.nextInt();
        
        soma = 1;
        
        System.out.println("Multiplicação3 de todos os números entre 1 e " + n + ":");
        
        for (i=1;i <= n;i++) {
            soma = soma * i;
            if (i == n) {
            System.out.print(i + " = " + soma);
            } else{
            System.out.print(i + " * ");
            }
        }
    }
}
