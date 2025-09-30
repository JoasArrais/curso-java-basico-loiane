import java.util.Scanner;

public class Exer36 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============ hortifruti ==========");

        System.out.printf("Informe quantos KG de morangos: KG ");
        double kgMorango = scanner.nextDouble();

        System.out.printf("Informe quantos KG de maçãs: KG ");
        double kgMacas = scanner.nextDouble();

        double precoMorango = 0;
        double precoMaca = 0;

        if (kgMorango <= 5) {
            precoMorango = 2.50;

        } else {
            precoMorango = 2.20;

        }

        if (kgMacas <= 5){
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double precoMoranFinal = kgMorango * precoMorango;
        double precoMacaFinal = kgMacas * precoMaca;
        double total = precoMoranFinal + precoMacaFinal;

        System.out.println("Total por PESO: " + kgMorango +  " de Morango: R$" + precoMoranFinal);
        System.out.println("Valor por PESO: " + kgMacas + " de Maçãs: R$" + precoMacaFinal);
        System.out.println(" ");

        System.out.println("Total: R$" + total);


        if ((kgMorango + kgMacas) >= 8 || total > 25){
            double desconto = (total * 10) / 100;
            System.out.println("Total com desconto: " + (total - desconto));
        }

    }
}
