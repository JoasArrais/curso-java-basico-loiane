import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um numero: ");
        int numero = scanner.nextInt();

        if (numero >= 0 ){
            System.out.println("Este numero é positivo ");
        } else {

          System.out.println("Este numero é negativo");

        }

    }


}
