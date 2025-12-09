import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exerc14 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int soma = 0;
        int impar = 0;



        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor de " + i + ": ");
            vetorA[i] = scan.nextInt();


        }
        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
             impar++;
            }


        }

        System.out.print("Valor de A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("A soma dos valores Impares é  : " + soma);
        System.out.println("A média aritmética simples deles é: " + df.format(soma / impar));


    }

}
