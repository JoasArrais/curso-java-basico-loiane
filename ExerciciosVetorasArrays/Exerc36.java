import java.util.Scanner;

public class Exerc36 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

        }

        for (int i = 1; i < vetorA.length; i++) {

            vetorB[i] = 1;

            for(int j = 1; j <= vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }

        System.out.println();
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print(" Fatorial dos elementos: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
