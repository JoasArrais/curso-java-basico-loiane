import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.printf("Entre a quantidade de turmas: ");
        int qtdTurmas = scan.nextInt();

        int qtdAlunos = 0;
        double soma = 0;
        double media;


        for (int i = 0; i < qtdTurmas; i++) {

            boolean invalido = true;

            do {

                System.out.println("informe a quantidade de alunos na turma: " + (i + 1));
                qtdAlunos = scan.nextInt();

                if (qtdAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("A media permitida excede a maxima de 40 alunos");
                }


            } while (invalido);

            soma += qtdAlunos;

        }
        media = soma / qtdTurmas;

        System.out.println("Media de Alunos por turma é: " + media);


    }

}


