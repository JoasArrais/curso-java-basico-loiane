import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=================== Dias da semana ===================");
        System.out.println("Informe o numero que corresponde ao dia da semana ");
        System.out.println(" 1 -  Domingo ");
        System.out.println(" 2 -  Segunda");
        System.out.println(" 3 -  Terça");
        System.out.println(" 4 -  Quarta");
        System.out.println(" 5 -  Quinta");
        System.out.println(" 6 -  Sexta");
        System.out.println(" 7 -  Sábado");

        int dia = scanner.nextInt();

         switch (dia){

             case 1 :  System.out.println("Domingo");
                 break;
             case 2 :  System.out.println("Segunda");
                 break;
             case 3 :  System.out.println("Terça");
                 break;
             case 4 :  System.out.println("Quarta");
                 break;
             case 5 :  System.out.println("Quinta");
                 break;
             case 6 :  System.out.println("Sexta");
                 break;
             case 7 :  System.out.println("Sábado");
                 break;
             default : System.out.println("Não é uma valor valido");
        }


    }

}
