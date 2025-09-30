import javax.xml.transform.Source;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um numero Inteiro:  ");
        double num1 = scanner.nextDouble();

        System.out.printf("Informe outro numero Inteiro:  ");
        double num2 = scanner.nextDouble();

        System.out.printf("Informe outro numero Real:  ");
        double num3 = scanner.nextDouble();


        double produto = (num1 * 2) * (num2 / 2);
        System.out.println("O produto do dobro de " + num1 + " Com a metade de: " + num2 + " è: " + produto);

        double soma = (num1 * 3) + num3;
        System.out.println("A Soma do triplo de: " + num1 + " Com: " + num3 + " è: " + soma);


        double cubo = Math.pow(num3, 3);
        System.out.println("O valor de: " + num3 + " elevado ao cubo é: " + cubo);


    }
}
