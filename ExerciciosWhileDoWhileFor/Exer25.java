import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String novaCompra;
        do {

            System.out.println("========== Lojas Tabajara ========== ");


            double preco = 0;
            double total = 0;
            int i = 1;
            double dinheiro;
            double troco;



            do {

                System.out.println("Produto " + i + ":");
                preco = scan.nextDouble();
                total += preco;

            } while (preco != 0);

            System.out.println("Total R$" + total);

            System.out.println("Qual a forma de pagamento? \n 1 - Cartão | 2 - dinheiro");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Valor a pagar: R$" + total);
            } else if (opcao == 2) {
                System.out.println("Valor recebido: ");
                dinheiro = scan.nextInt();

                troco = dinheiro - total;
                System.out.println("Troco: " + troco);
                System.out.println("========== Lojas Tabajara ========== ");
                System.out.println(" ");

            }


            System.out.println("Iniciar nova compra? [S/N]");
            novaCompra = scan.next();

        } while (novaCompra.equalsIgnoreCase("s"));

         if(novaCompra.equalsIgnoreCase("n")) {
             System.out.println("========== Obrigado por comprar nas Lojas Tabajara ========== ");
         }

    }
}