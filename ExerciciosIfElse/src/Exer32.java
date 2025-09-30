import javax.xml.transform.Source;
import java.util.Scanner;

public class Exer32 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" =========== Par Ou Ímpar ==========");
        System.out.printf("Informe um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " É Par!");
        } else {
            System.out.println(numero + " É Ímpar!");
        }


    }
}