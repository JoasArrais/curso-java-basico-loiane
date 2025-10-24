import java.util.Scanner;

public class Exer17 {    public static void main(String[] args) {

    int primeiro = 1;
    int segundo = 1;

    Scanner scan = new Scanner(System.in);

    System.out.println(primeiro);
    System.out.println(segundo);

    System.out.println("Informe o valor para cauculo do seu fatorial: ");
    int numero = scan.nextInt();

    System.out.println(numero + "! = ");

    int fatorial = 1;

    for (int i = numero; i > 0; i--){
        fatorial *= i;
        System.out.println( i + " * ");
    }
    System.out.println("Resultado: " + fatorial);

}
}