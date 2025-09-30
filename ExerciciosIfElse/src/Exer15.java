import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um numero: ");
        int numero1 = scanner.nextInt();

        System.out.printf("Informe um numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }

    }

}    
