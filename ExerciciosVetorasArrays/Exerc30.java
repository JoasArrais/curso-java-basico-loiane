import java.util.Scanner;

public class Exerc30 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        int posB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        // Primeiro adiciona os pares
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        // Depois adiciona os ímpares
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.println();
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}