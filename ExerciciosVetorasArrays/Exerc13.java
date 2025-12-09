import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor de " + i + ": ");
            vetorA[i] = scan.nextInt    ();
        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
                System.out.println("O valor: " + vetorA[i] + " É Multiplo de 5");
            }

        }
        System.out.println();

        System.out.println("A Soma dos multiplos de 5 é: " + soma);

    }
}
