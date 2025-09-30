import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe o tamanho do lado do Quadrado: ");
        double lado = scan.nextDouble();

        //double valor = (area * area);
        double area = Math.pow(lado, 2);


        System.out.println("O valor da area deste quadrado é: " + area);
        System.out.println("E o dobro dele é " + (area * 2 ));


    }
}