import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        int soma = 0;
        int qtdIguais15 = 0;
        int mairQ15 = 0;
        int qtdMaiores = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor de " + i + ": ");
            vetorA[i] = scan.nextInt();

        }
        System.out.println();


        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA [i] < 15) {
                soma += vetorA[i];

            } else if (vetorA[i] == 15) {
                qtdIguais15 ++;

            } else {
                mairQ15 += vetorA[i];
                qtdMaiores++;
            }

        }
        System.out.println();

        System.out.println("Soma dos elementos inferiores a 15:  " + soma );
        System.out.println("Quantidade de elementos iguais a 15: " + qtdIguais15 );

        if (qtdMaiores > 0) {
            int media =  mairQ15 / qtdMaiores;
            System.out.println("Media dos valores superiores a 15: " + media);
        } else {
            System.out.println("Não há valores superiores a 15 para calculo da media!");
        }
        System.out.println();
    }
}
