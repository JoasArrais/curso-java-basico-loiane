import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        int qtdMaior15 = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a Idade da pessoa " + (i+1) + ": ");
            idades[i] = scan.nextInt();

        }

        System.out.print("Valor de A = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >  35) {
                qtdMaior15++;
            }

        }
        System.out.println();
        System.out.println("Quantidade de pessoas com idade Superior a 35 anos: " + qtdMaior15 );;
        System.out.println();
    }
}
