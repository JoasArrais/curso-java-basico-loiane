import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da temperatura em ºC :  ");
        double celsius = scanner.nextDouble();

        double farenheit = (celsius * 1.8 ) + 32;

        System.out.println("A temperatura hoje em ºF é de: " + farenheit);

    }
}
