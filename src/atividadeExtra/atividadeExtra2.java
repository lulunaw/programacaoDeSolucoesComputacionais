package atividadeExtra;
import java.util.Scanner;
public class atividadeExtra2 {
    public static int somar (int n1, int n2) {
        int soma;

        soma = n1+n2;
        return soma;
    }
    public static int subtrair (int n1, int n2) {
        int subtrair;
        subtrair = n1-n2;
        return subtrair;
    }
    public static int multiplicar (int n1, int n2) {
        int multiplicar;
        multiplicar = n1*n2;
        return multiplicar;
    }

    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);

        int alternativas, n1, n2;

        //Tela inicial
        System.out.println ("O que você quer fazer?");
        System.out.println ("1 - Somar A com B");
        System.out.println ("2 - Subtrair A por B");
        System.out.println ("3 - Multiplicar A por B");
        alternativas = input.nextInt ();

        //Opções
        switch (alternativas)
        {
            case 1:
                System.out.println ("Qual o número A?");
                n1 = input.nextInt ();
                System.out.println ("Qual o número B?");
                n2 = input.nextInt ();
                System.out.println ("Resultado:");
                System.out.println (n1 + "+" + n2  + " = " + somar (n1, n2));
                break;

            case 2:
                System.out.println ("Qual o número A?");
                n1 = input.nextInt ();
                System.out.println ("Qual o número B?");
                n2 = input.nextInt ();
                System.out.println ("Resultado:");
                System.out.println (n1 + "-" + n2  + " = " + subtrair (n1, n2));
                break;
            case 3:
                System.out.println ("Qual o número A?");
                n1 = input.nextInt ();
                System.out.println ("Qual o número B?");
                n2 = input.nextInt ();
                System.out.println ("Resultado:");
                System.out.println (n1 + "*" + n2  + " = " + multiplicar (n1, n2));
                break;
        }
    }
}
