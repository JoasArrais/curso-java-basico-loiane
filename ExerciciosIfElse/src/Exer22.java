import java.util.Scanner;

public class Exer22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("========= Qual o produto mais barato =========");
        System.out.printf("Informe o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();

        System.out.printf("Informe o preço do primeiro produto: ");
        double produto2 = scanner.nextDouble();

        System.out.printf("Informe o preço do primeiro produto: ");
        double produto3 = scanner.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("O produto mais barato destes foi o de valor: " + produto1);
        } else if (produto2 <= produto1 && produto2 <= produto3){
            System.out.println("O produto mais barato destes foi o de valor: " + produto2);
        } else {
            System.out.println("O produto mais barato destes foi o de valor: " + produto3);
        }


    }
}


