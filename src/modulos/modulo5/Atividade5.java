//13. Faça um programa que leia a idade e o sexo de 10 pessoas, e mostre quantas pessoas do sexo feminino existem entre 20 e 40 anos.
package modulos.modulo5;
import java.util.Scanner;
public class Atividade5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sexo, idade, i, n;

        /*Retorno de resultados*/

        n = 0;

        for (i=1; i<=10; i++) {
            System.out.println("Qual seu Gênero?");
            System.out.println("1 - Mulher");
            System.out.println("2 - Homem");
            sexo = input.nextInt();
            System.out.println("Qual a idade?");
            idade = input.nextInt();

            switch (sexo) {
                case 1:
                    if (idade >=20 && idade <=40){
                        n = n + 1;
                    } else {}
                case 2:
                    break;
            }
        }
        System.out.println("O número total de mulheres entre 20-40 anos é de " + n);
    }
}
