import java.util.Scanner;

public class Exerc34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

        }

        System.out.println("\nDivisores de 0 até cada número do vetor A:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Divisores de : " + vetorA[i]);


            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0){
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }
}
