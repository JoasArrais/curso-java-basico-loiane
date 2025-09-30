import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("======= Maior e Menor Valor ======");

        System.out.printf("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Digite um novo numero: ");
        int numero2 = scanner.nextInt();
        System.out.printf("Digite mais um numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("Numero " + numero1 + " Ganhou a rodada");
        } else if (numero2 >= numero1 && numero2 >= numero3){
            System.out.println("Numero " + numero2 + " Ganhou a rodada");
        } else {
            System.out.println("Numero " + numero3 + " Ganhou a rodada");

        }

        if (numero1 <= numero2 && numero1 <= numero3){
            System.out.println("Numero " + numero1 + " foi o menor desta rodada");
        } else if (numero2 <= numero1 && numero2 <= numero3){
            System.out.println("Numero " + numero2 + " foi o menor desta rodada");
        } else {
            System.out.println("Numero " + numero3 + " foi o menor desta rodada");
        }
    }

}
