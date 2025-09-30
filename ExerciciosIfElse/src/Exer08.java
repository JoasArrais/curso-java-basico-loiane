import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor que você recebe por hora:  ");
        double valorHora = scanner.nextDouble();
        System.out.printf("Informe a quantidade de horas trabalhadas neste mês: ");
        double quantHoras = scanner.nextDouble();

        double salario = quantHoras * valorHora;

        System.out.println("Você receberá o valor de: " + salario);

    }
}
