import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero1 = Scan.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = Scan.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("A soma dos valores é: " + resultado);


    }

}
