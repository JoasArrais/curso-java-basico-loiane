import java.util.Scanner;

public class Exer37 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Mercado Tabajara - Açougue ==========");

        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipoCarne = scanner.nextInt();

        System.out.printf("Informe a quantidade de carne comprada: KG ");
        double qtdCarne = scanner.nextDouble();

        double precoKg = 0;

        if (tipoCarne == 1) {
            System.out.println(qtdCarne + "kg - Filé Duplo");
            if (qtdCarne <= 5) {
                precoKg = 4.90;

            } else {
                precoKg = 5.80;
            }

        } else if (tipoCarne == 2) {
                System.out.println(qtdCarne + "kg - Filé Alcatra");
                if (qtdCarne <= 5) {
                    precoKg = 5.90;

                } else {
                    precoKg = 6.80;
                }


        } else if (tipoCarne == 3){
            System.out.println(qtdCarne + "kg - Picanha");
            if (qtdCarne <= 5) {
                precoKg = 6.90;

            } else {
                precoKg = 7.80;
            }



        }

        double total = qtdCarne * precoKg;
        System.out.println(qtdCarne + " kg * " + precoKg + " = " + total);
        System.out.println(" ");

        System.out.println("A compra será no cartão?!   [ 1 - SIM ]");
        int cartao = scanner.nextInt();

        if (cartao == 1 ){
            double desconto = (total * 5 ) / 100;
            System.out.println("Deconto cartão: " + desconto);
            System.out.println("Valor Final" + (total - desconto));
        } else {
            System.out.println("Valor Final" + total);
        }
    }

}
