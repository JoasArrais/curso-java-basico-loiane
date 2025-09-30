import java.util.Scanner;

public class Exer31 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============= ANOS BISSEXTOS =============");
        System.out.printf("Informe o ano que voce deseja confirmar:  ");
        int ano = scanner.nextInt();
        boolean bissexto = true;

        if (ano % 4 == 0 && ano % 100 != 0){
            bissexto = true;
            System.out.println(ano + " É um ano Bissexto");
        } else if (ano % 400 == 0){
            bissexto = true;
            System.out.println(ano + " É um ano Bissexto");
        } else {
             bissexto = false;
            System.out.println(ano + " Não é um ano bissexto" );
        }



    }
}

