package atividadeExtra.d00mmaaaa;
import java.util.Scanner;
public class usoDeArray
{
    public static void main(String[] args) {
        //Recursos
        Scanner input = new Scanner(System.in);
        int soma = 0, funcao;
        int [] numero = new int [10];

        //Coleta de valores
        for (int i=0;i <= 9;i++) {
            System.out.println("Digite o " + (i+1) + "° número");
            numero [i] = input.nextInt();
            soma = soma + numero [i];
        }
        System.out.println(" ");
        //Seleção de função
        System.out.println("O que você quer fazer com os números?");
        System.out.println("1 = Somar");
        System.out.println("2 = Calcular média");
        System.out.println("3 = Mostrar a quantidade par e impar");
        System.out.println("4 = Mostrar na ordem contrária");
        funcao = input.nextInt();
        System.out.println(" ");
        System.out.println("Resultado:");
        //Execução
        switch (funcao) {
            case 1:
                for (int i=0;i <= 9;i++) {
                    if (i==9) {
                        System.out.print(numero[i] + " = " + soma);
                    }else {
                        System.out.printf("%d + ", numero[i]);
                    }
                }
                break;
            case 2:
                int media;
                media = soma/numero.length;
                System.out.print("A média dos números (");
                for (int i=0;i <= 9;i++) {
                    if (i==9) {
                        System.out.print(numero[i] + ") é " + media);
                    }else {
                        System.out.printf("%d, ", numero[i]);
                    }
                }
                break;
            case 3:
                int par = 0, impar = 0;
                System.out.print("Entre os números (");
                for (int i=0;i <= 9;i++) {
                    if (i==9) {
                        System.out.print(numero[i] + ") ");
                    }else {
                        System.out.printf("%d, ", numero[i]);
                    }
                    if (numero[i]% 2 == 0) {
                        par = par + 1;
                    } else {
                        impar = impar + 1;
                    }
                }
                System.out.println("existem " + par + " números pares e ");
                System.out.print(impar + " impares");
                break;
            case 4:
                int c;
                System.out.println("A ordem inversa é ");
                for (int i=0;i <= 9;i++) {
                    c = numero.length - (i + 1);
                    if (i==9) {
                        System.out.print(numero[c]);
                    }else {
                        System.out.printf("%d, ", numero[c]);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
