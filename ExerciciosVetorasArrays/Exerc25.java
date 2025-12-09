import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição A " + i + ":");
            vetorA[i] = scan.nextInt();

        }

        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição B " + i + ":");
            vetorB[i] = scan.nextInt();


            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }


        }
        System.out.println();
        System.out.print("Valor de A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Valor de B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.print("Valor de C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }

}


