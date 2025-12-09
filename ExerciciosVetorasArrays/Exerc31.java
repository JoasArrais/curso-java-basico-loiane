import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " +i +":");
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("\nTabuada de " + i +"\n");

            for (int j = 0; j <= 10; j++) {
                System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
            }
            System.out.printf("");
        }
    }
}