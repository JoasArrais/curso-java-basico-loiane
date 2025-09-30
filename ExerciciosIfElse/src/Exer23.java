import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("======== Quem é o maior valor ========");

        System.out.printf("Digite um numero: ");

        System.out.printf("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Digite um novo numero: ");
        int numero2 = scanner.nextInt();
        System.out.printf("Digite mais um numero: ");
        int numero3 = scanner.nextInt();

        if (numero1>= numero2 && numero1>= numero3) { // n1 é o maior
            if (numero2 >= numero3) {
                System.out.println(numero1 + " - " + numero2 + " - " + numero3);
            } else {
                System.out.println(numero1 + " - " + numero3 + " - " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) { // numero2 é o maior
            if (numero1 >= numero3) {
                System.out.println(numero2 + " - " + numero1 + " - " + numero3);
            } else {
                System.out.println(numero2 + " - " + numero3 + " - " + numero1);
            }
        } else {  // numero3 é o maior
            if (numero1 >= numero2) {
                System.out.println(numero3 + " - " + numero1 + " - " + numero2);
            } else {
                System.out.println(numero3 + " - " + numero2 + " - " + numero1);
            }
        }

    }
}