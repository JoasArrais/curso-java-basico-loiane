import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor de " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++){
            soma += vetorA[i]; ;
        }
        System.out.println();

        System.out.print("Valor de A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("A Soma dos valores é: " + soma);
    }

}
