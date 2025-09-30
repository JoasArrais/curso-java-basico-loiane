import java.util.Scanner;

public class Exer28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("========== Aprovado/Reprovado ========== ");
        System.out.printf("Informe a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.printf("Informe a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito = " ";

        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else if (media >= 0.0 && media < 4.0) {
            conceito = "E";

        }

        System.out.println("Primeira Nota: " + nota1);
        System.out.println("Segunda  Nota: " + nota2);
        System.out.println("Media:         " + media);
        System.out.println("Conceito:      " + conceito);

        switch (conceito) {

            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;

            case "D":
            case "E":
                System.out.println("REPROVADO");
                break;

        }
    }
}

