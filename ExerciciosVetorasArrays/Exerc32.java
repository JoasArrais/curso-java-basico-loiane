import java.util.Scanner;

public class Exerc32 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um numero para a posição " + i + ":");
            vetorA[i] = scan.nextInt();

        }

        boolean primo = true;
        String msg;

        for (int i = 0; i < vetorA.length; i++) {

            primo = true;

            for (int j = 2; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            msg = " ";
            if (primo){
                msg = " é Primo ";
            } else {
                msg = " Não é Primo ";
            }
            System.out.println(vetorA[i] + msg);

        }


    }

}