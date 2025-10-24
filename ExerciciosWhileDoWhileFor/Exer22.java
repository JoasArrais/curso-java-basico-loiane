import java.util.Scanner;

public class Exer22 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de CD's: ");
        int qtdCd = scan.nextInt();

        double media;
        double valorCd = 0;
        double totalCd = 0;

        for (int i = 0; i < qtdCd; i++){
            System.out.println("Informe o valor deste CD: " + (i+1));
            valorCd = scan.nextDouble();

            totalCd += valorCd;

        }

        media = totalCd / qtdCd;

        System.out.println("Valor total investido na sua coleção: " + totalCd);
        System.out.println("Valor Medio em cada CD: " + media);
    }
}
