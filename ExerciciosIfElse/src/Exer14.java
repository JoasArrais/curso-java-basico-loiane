import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o tamanho do arquivo para download:  ");
        double tamArquivo = scanner.nextDouble();

        System.out.printf("Informe a  velocidade da internet:  ");
        double velocInter = scanner.nextDouble();

        double tempo = tamArquivo / velocInter;

        System.out.println("O tempos estimado para download é: " + tempo +" minutos");





    }
}
