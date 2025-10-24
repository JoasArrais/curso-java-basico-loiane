import java.util.Scanner;

public class Exer35 { public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.printf("Informe o valor de N: ");
    int n = scan.nextInt();

    double soma = 0;

    for (int i = 1, s= 1; i < n; i++, s+=2){
        System.out.print(i + "/" + s + " + ");

        soma += i/s;

    }
    System.out.println("\nSoma: " + soma);

}
}
