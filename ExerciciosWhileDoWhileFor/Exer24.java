import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("========== Panificadora Pão de Ontem - Tabela de preços ========== ");

       System.out.println("Informe o valor do pão: ");
       double valor = scan.nextDouble();

       for (int i = 1; i <= 50; i++){

           System.out.println( i + " - R$" +( valor * i));

       }


    }


}

