import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0 ;
        double media;

        for (int i = 0; i < 5; i++){

            System.out.printf("Informe um numero para o cauculo:  ");
            num = scanner.nextInt();

            soma += num;

        }

        media = soma / 5 ;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);

    }
}
