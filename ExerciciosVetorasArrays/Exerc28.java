import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " +i +":");
            vetorA[i] = scan.nextInt();

            vetorC[i] = vetorA[i];
        }
        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " +i +":");
            vetorB[i] = scan.nextInt();

        }

        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
                vetorC[i + vetorA.length] = vetorB[i]; // faz com que C traga os elementos seguindo o indicie do tamanho de a, e depois receba os valores de b
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
