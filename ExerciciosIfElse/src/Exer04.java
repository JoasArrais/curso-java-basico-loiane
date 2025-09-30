import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe a 1º nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.printf("Informe a 2º nota do aluno: ");
        double nota2 = scan.nextDouble();
        System.out.printf("Informe a 3º nota do aluno: ");
        double nota3 = scan.nextDouble();
        System.out.printf("Informe a 4º nota do aluno: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media deste aluno é:  " + media);


    }
}
