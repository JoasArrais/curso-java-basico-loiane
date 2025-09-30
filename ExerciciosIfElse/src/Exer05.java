import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe o valor em metros para conversão em cm: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println("O valor de " + metros + " m em centrimetros é de: " + cm + " cm");


    }
}
