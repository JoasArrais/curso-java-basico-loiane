import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for(int i = 0; i < vetorA.length;i++){
            System.out.println("Entre com um numero para a posição: " +i);
            vetorA[i]  = scan.nextInt();

            if (vetorA[i] % 2 != 0){ // para o programa quando não for par
                break;
            }

        }

    }
}