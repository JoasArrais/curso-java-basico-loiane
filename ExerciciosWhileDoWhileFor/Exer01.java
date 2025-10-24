
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean notaValida = false;
        do {
            System.out.printf("Entre com uma nota de 0 a 10: ");
            double nota = scanner.nextDouble();


            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("A nota que voce digitou foi: " + nota);
            } else {
                System.out.println("Nota invalida! Digite novamente: ");
            }
        } while (!notaValida);
    }

}
