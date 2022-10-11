/*17. Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 kg
- a média das idades das sete pessoas*/
package modulos.modulo5;
import java.util.Scanner;
public class Atividade9
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variáveis
        int idade, peso, media, i, n;

        //Processo
        n = 0;
        media = 0;

        for (i=1; i<=7;i++) {
            //Pergunta
            System.out.println("Sobre a " + i + "° pessoa");
            System.out.println("Qual o peso?");
            peso = input.nextInt();
            System.out.println("Qual a idade?");
            idade = input.nextInt();
            if (peso > 90) {
                n = n + 1;
            }else {}
            media = media + idade;
        }
        /*Retorno de resultados*/
        System.out.println("A quantidade de pessoas com mais de 90 kg é de " + n);
        System.out.println("A média das idades das sete pessoas é de " + media / 7);
    }
}
