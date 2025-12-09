import java.util.Scanner;

public class Exerc20 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];

        System.out.print("Entre com a contação do Dolar U$ de hoje: ");
        double cotacao = scan.nextDouble();

        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);

        }

        System.out.println("Valor de A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + "\n ");
        }

    }

}