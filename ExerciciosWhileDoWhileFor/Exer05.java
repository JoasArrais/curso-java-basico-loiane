import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double popA;
        double popB;
        double taxaCrescA;
        double taxaCrescB;

        boolean valido = false;

        do {
            System.out.printf("Entre com o valor da população A: ");
            popA = scanner.nextDouble();

            if (popA > 0) {
                valido = true;

            } else {
                System.out.println("População precisa ser maior que 0");
            }
            while (!valido) ;


            do {
                System.out.printf("Entre com o valor da população B: ");
                popB = scanner.nextDouble();

                if (popB > 0) {
                    valido = true;

                } else {
                    System.out.println("População precisa ser maior que 0");
                }
            } while (!valido);


            do {
                System.out.printf("Entre com o valor da taxa de crescimento da população A: ");
                taxaCrescA = scanner.nextDouble();

                if (taxaCrescA > 0) {
                    valido = true;

                } else {
                    System.out.println(" A taxa de crescimento da população A precisa ser maior que 0");
                }
            } while (!valido);

            do {
                System.out.printf("Entre com o valor da taxa de crescimento da população B: ");
                taxaCrescB = scanner.nextDouble();

                if (taxaCrescB > 0) {
                    valido = true;

                } else {
                    System.out.println(" A taxa de crescimento da população B precisa ser maior que 0");
                }
            } while (!valido);

            int cont = 0;

            while (popA < popB) {

                popA += (popA / 100) * taxaCrescA;
                popB += (popB / 100) * taxaCrescB;
                cont++;
            }
            System.out.println("População A: " + popA);
            System.out.println("População B: " + popB);
            System.out.println("Quantidade de anos: " + cont);
        } while (!valido);


    }
}

