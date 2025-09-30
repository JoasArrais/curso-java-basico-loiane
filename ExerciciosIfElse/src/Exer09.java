import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da temperatura em ºF :  ");
        double farenheit = scanner.nextDouble();

        double celsius = (5* (farenheit - 32 ) / 9);

        System.out.println("A temperatura hoje em ºC é de: " + celsius);


    }

}
