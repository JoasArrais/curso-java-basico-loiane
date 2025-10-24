import java.util.Scanner;

public class Exer30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Montar a tabuada do: ");
        int num1 = scan.nextInt();

        System.out.print("Começar do Multiplicando: ");
        int multiplicando = scan.nextInt();

        System.out.print("Começar do Multiplicando: ");
        int multiplicador = scan.nextInt();

        System.out.println("");

        int resultado = 0;

        System.out.println("Vou montar a tabuada de " + num1+ " começando do " + multiplicando + " terminando em " + multiplicador+ ":");
        for (int i = multiplicando; i <= multiplicador; i++){

            resultado = multiplicando * multiplicador;

            System.out.println(num1 + " x " + multiplicador + " = " + resultado );
        }

    }
}


