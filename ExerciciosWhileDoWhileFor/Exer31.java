import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

        System.out.println("informe o valor do salario do funcionario: ");
        double salario = scan.nextDouble();

            double percentual = 1.5;

            salario += (salario * percentual) / 100;

        DecimalFormat format = new DecimalFormat("###,###.###");

            for (int i= 1997; i <= 2015; i++){

                percentual *= 2;

                salario += (salario * percentual) / 100;

                System.out.println(i + " = " + format.format(salario) + " - " + percentual+ "%");

        }

    }
}
