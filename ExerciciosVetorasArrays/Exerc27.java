import java.util.Scanner;

public class Exerc27 {

    public static void main(String[] args) {


       Scanner scan = new Scanner(System.in);

       int[] vetorA = new int[10];
       int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " +i +":");
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - 1 - i] = vetorA[i]; // deixa a contagem de traz para frente
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

    }
 }