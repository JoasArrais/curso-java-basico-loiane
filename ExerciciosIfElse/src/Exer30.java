import java.util.Scanner;

public class Exer30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("RAIZES - EQUAÇÃO DE SEGUNDO GRAU");
        System.out.println("Informe o valor de a: ");
        double valorA = scanner.nextDouble();

        if (valorA == 0) {
            System.out.println("Não é equação de segundo grau!");
        } else {

            System.out.println("Informe o valor de b: ");
            double valorB = scanner.nextDouble();

            System.out.println("Informe o valor de c: ");
            double valorC = scanner.nextDouble();

            double delta = (valorB * valorB) - (4 * valorA * valorC);
            if (delta < 0) {
                System.out.println("Delta negativo");
            } else {

                System.out.println("Delta: " + delta);

                double x1 = ((-valorB + Math.sqrt(delta)) / (2 * valorA));
                double x2 = ((-valorB - Math.sqrt(delta)) / (2 * valorA));

                System.out.println("X1 é = " + x1);
                System.out.println("X2 é = " + x2);


            }

        }

    }
}
