import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean encerrar = false;
        double valor = 0;
        double soma = 0;
        double total = 0;
        int codigo;
        int qtd;
        String output = "";

        do {
            encerrar = false;
            System.out.println("Informe o codigo do item e a quantidade desejada:  \nDigite 0 - Para encerrar o pedido");
            codigo = scan.nextInt();
            qtd = scan.nextInt();

            if (codigo == 0 && qtd == 0) {
                encerrar = true;
                continue;
            }

            if (codigo == 100) {
                valor = 1.20;
                output += "Cachorro Quente   R$ 1,20  | Qtd: " + qtd + "\n";

            } else if (codigo == 101) {
                valor = 1.30;
                output += "Bauru Simples     R$ 1,30  | Qtd: " + qtd + "\n";

            } else if (codigo == 102) {
                valor = 1.50;
                output += "Bauru com Ovo     R$ 1,50  | Qtd: " + qtd + "\n";

            } else if (codigo == 103) {
                valor = 1.20;
                output += "Hambúrguer        R$ 1,20  | Qtd: " + qtd + "\n";

            } else if (codigo == 104) {
                valor = 1.30;
                output += "Cheesebúrguer     R$ 1,30  | Qtd: " + qtd + "\n";

            } else if (codigo == 105) {
                valor = 1.00;
                output += "Refrigerante      R$ 1,00  | Qtd: " + qtd + "\n";


            } else {
                System.out.println("Código inválido!\n");
                continue;

            }

            soma = valor * qtd;
            total += soma;
            System.out.println("Valor do produto R$" + soma);

        } while (!encerrar);

        System.out.println(output);
        System.out.println("Valor total do pedido R$" + total);


    }

}