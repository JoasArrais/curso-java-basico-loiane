import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade correspondente a posição " + i + ": ");
            idades[i] = scan.nextInt();


        }

        int maior = idades[0] ;
        int menor = idades[0];

        int maiorPosicao = 0;
        int menorPosicao = 0;


        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menor) {
                menor = idades[i];
                menorPosicao = i;
            } else if (idades[i] > maior) {
                maior = idades[i];
                maiorPosicao = i;
            }
        }


        System.out.print("Valor de A = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor Idade: " + menor + " Posição: " + menorPosicao );
        System.out.println("Maior Idade: " + maior + " Posição: " + maiorPosicao );


    }
}
