import java.util.Scanner;

public class Exerc19 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] nota1 = new double[10];
        double [] nota2 = new double[nota1.length];
        double [] result = new double[nota1.length];

        for (int i = 0; i < nota1.length;   i++) {
            System.out.print("Informe a Primeira nota do Aluno " + (i+1) + ": ");
            nota1[i] = scan.nextDouble();
        }
        System.out.println();

        for (int i = 0; i < nota2.length; i++) {
            System.out.print("Informe a Segunda nota do Aluno " + (i+1) + ": ");
            nota2[i] = scan.nextDouble();

        }
        System.out.println();

        double soma = 0;

        for (int i = 0; i < nota2.length; i++) {

            soma = (nota1[i] + nota2[i])/2;

            result[i] = soma;

           if (result[i] >= 7){
               System.out.println("Aluno " + (i+1) + " Media: " + result[i] + " APROVADO!" );
           } else {
               System.out.println("Aluno " + (i+1) + " Media: " + result[i] + " REPROVADO!");
           }

        }
        System.out.println();

    }

 }
