import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Leitor de temperaturas - Informe a quatidade de temperaturas: ");
        int qtd = scan.nextInt();

        double temperaturas;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;



            for (int i = 0; i < qtd; i++) {
                System.out.println("Informe o valor da temperatura: " + i);
                temperaturas = scan.nextDouble();

                soma += temperaturas;

                if (temperaturas > maior){
                    maior = temperaturas;
                }

                if (temperaturas < menor){
                    menor = temperaturas;
                }
            }


            double media = soma / qtd;

            System.out.println("MEDIA DAS TEMPERATURAS: " + media);
            System.out.println("MAIOR TEMPERATURA: " + maior);
            System.out.println("MENOR TEMPERATURA: " + menor);



    }

}
