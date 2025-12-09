import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exerc04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[15];
        double [] vetorB = new double [vetorA.length];

        for (int i = 0; i < vetorA.length ; i++){
            System.out.println("Entre com o valor " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = sqrt(vetorA[i]);
        }
        System.out.println();


        System.out.print("Valor de A = ");
        for (int i = 0; i < vetorA.length ; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Raiz do valor = ");
        for (int i = 0; i < vetorB.length ; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();

    }
}