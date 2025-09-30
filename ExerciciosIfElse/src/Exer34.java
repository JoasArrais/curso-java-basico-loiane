import java.util.Scanner;

public class Exer34 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("============ Interrogatório ==========");

        System.out.printf("Você Telefonou para a vitima? [S/N]: ");
        String resp1 = scanner.next();

        System.out.printf("Você Esteve no local do crime?  [S/N]: ");
        String resp2 = scanner.next();

        System.out.printf("Mora perto da vítima? [S/N]: ");
        String resp3 = scanner.next();

        System.out.printf("Voce já trabalhou para a vítima? [S/N]:");
        String resp4 = scanner.next();

        System.out.printf("Voce devia algo a vítima? [S/N]:");
        String resp5 = scanner.next();


        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) cont++;
        if (resp2.equalsIgnoreCase("S")) cont++;
        if (resp3.equalsIgnoreCase("S")) cont++;
        if (resp4.equalsIgnoreCase("S")) cont++;
        if (resp5.equalsIgnoreCase("S")) cont++;


        if (cont == 2) {
                    System.out.println("O interrogado é Suspeito");
        } else if (cont == 3 || cont == 4) {
                    System.out.println("O interrogado é Cúmplice");
        } else if (cont == 5) {
                    System.out.println("O interrogado é o Assassino");
        } else {
            System.out.println("O interrogado é Inocente");
        }
    }
}

