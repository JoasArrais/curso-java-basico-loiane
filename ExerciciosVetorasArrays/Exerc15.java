import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int par = 0;
        int impar = 0;


        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor de " + i + ": ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                par++;

            } else {

                impar++;
            }
        }
        System.out.println();


        System.out.println("Quantidade de numeros pares " + par);
        System.out.println("Quantidade de numeros impares " + impar);
        System.out.println();

        int perctPar = (par * 100)/vetorA.length;
        System.out.println("Percentual de Pares: " + perctPar+"%");

        int perctImpar = (impar * 100)/vetorA.length;
        System.out.println("Percentual de Impares: " + perctImpar+"%");
    }

}
