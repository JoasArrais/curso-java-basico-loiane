import java.util.Scanner;

public class Exer29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("========= Descubra qual o tipo de triangulo =========");

        System.out.printf("Informe o valor do primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.printf("Informe o valor do segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.printf("Informe o valor do terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("TRIÂNGULO EQUILÁTERO! ");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("TRIÂNGULO ISÓSCELES! ");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("TRIÂNGULO ESCALENO!");
            } else {
                System.out.println("Estes valores não formam um triângulo!");
            }
        }
    }

}
