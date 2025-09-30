import java.util.Scanner;

public class Exer35 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Posto de Combustiveis ==========");

        System.out.printf("Informe o número de lítros vendido:  ");
        double litros = scanner.nextDouble();

        System.out.printf("Qual o tipo de combustivel abastecido? [A - álcool / G - gasolina]:  ");
        String combustivel = scanner.next();

        double valorTotalAlcool = litros * 1.90;
        double valorTotalGasolina = litros * 2.50;

        double percentualDesc = 0;



        if (combustivel.equalsIgnoreCase("A")) {

            if (litros <= 20) {
                percentualDesc = 3;
            } else {
                percentualDesc = 5;
            }

            double desconto = (valorTotalAlcool * percentualDesc)/100;
            System.out.println("Valor total: R$" + valorTotalAlcool);
            System.out.println("Valor total com desconto: R$" +(valorTotalAlcool - desconto));

        } else if (combustivel.equalsIgnoreCase("G")) {

            if (litros <= 20) {
                percentualDesc = 4;

            } else {
                percentualDesc = 6;
            }
            double desconto = (valorTotalGasolina * percentualDesc) / 100;
            System.out.println("Valor total: R$" + valorTotalGasolina);
            System.out.println("Valor total com desconto: R$" + (valorTotalGasolina - desconto));
        }

    }

}

