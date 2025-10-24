import java.util.Scanner;

public class Exer34 { public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.printf("Informe o valor de N: ");
    int n = scan.nextInt();

    double soma = 0;

    for (int i = 1, h= 1; i < n; i++, h++){
        System.out.print(" 1/" + h + " + ");

        soma += 1/h;

    }
    System.out.println("\nSoma: " + soma);

  }
}

