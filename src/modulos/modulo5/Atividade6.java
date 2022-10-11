/*Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas pessoas do sexo masculino possuem peso entre 60
e 80 kg, bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.*/
package modulos.modulo5;
import java.util.Scanner;
public class Atividade6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sexo, peso, i, n;

        /*Retorno de resultados*/

        n = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println("Qual seu Gênero?");
            System.out.println("1 - Homem");
            System.out.println("2 - Mulher");
            sexo = input.nextInt();
            System.out.println("Qual a peso?");
            peso = input.nextInt();

            switch (sexo) {
                case 1:
                    if (peso >= 60 && peso <= 80) {
                        n = n + 1;
                    } else {
                    }
                    break;
                case 2:
                    if (peso >= 50 && peso <= 70) {
                        n = n + 1;
                    } else {
                    }
                    break;
            }
        }
        System.out.println("O número total de homens entre 60-80 kg e mulheres entre 50-70 kg é de " + n);
    }
}
