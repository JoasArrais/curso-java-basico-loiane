import java.util.Scanner;

public class Exerc33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

        }

        System.out.println("\nPares de 0 até cada número do vetor A:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o numero: " + vetorA[i]);

            for (int j = 2; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}


