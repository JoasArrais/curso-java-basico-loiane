import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com um numero: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i = num1 ; i <= num2 ; i++){
            soma += i;

        }

        System.out.println("Soma dos valores entre " + num1 + " e "+ num2 +" dé: " + soma);
    }

}

