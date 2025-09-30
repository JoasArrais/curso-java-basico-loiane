import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da 1º nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.printf("Informe o valor da 2º nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double notafinal = (nota1 + nota2) / 2;

        if (notafinal == 10){
            System.out.println("Aluno aprovado com distinção! nota final: " + notafinal);
        } else if (notafinal >= 7){
            System.out.println("APROVADO: " + notafinal);
        } else {
            System.out.println("REPROVADO");
        }
    }


}
