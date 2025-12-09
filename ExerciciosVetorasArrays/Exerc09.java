import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        double [] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor de " + i + ": " );
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Entre com o valor de " + i + ": ");
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] / vetorB[i];

        }
        System.out.println();

        System.out.print("Valor de A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Valor de B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print( vetorB[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("##,###.##");

        System.out.print("Soma de valores de A e B = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i]+ " ");
        }
        System.out.println();
    }
}
