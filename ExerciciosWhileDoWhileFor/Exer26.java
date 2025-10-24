import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o valor para cauculo do seu fatorial: ");
        int numero = scan.nextInt();

        System.out.print("Fatorial de " + numero);
        int fatorial = 1;

        System.out.print(numero + "! = ");

        for (int i = numero; i > 1; i--){
            fatorial *= i;
            System.out.print( i + " . ");
        }
        System.out.print(" 1 = : " + fatorial);


    }


}
