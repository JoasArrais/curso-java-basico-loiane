import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe de qual valor será feita a tabuada [0 a 10]: ");
        int tab = scan.nextInt();

        System.out.println("Tabuada do" + tab + ":");

        for (int i = 1; i <=10; i++){

            int resultado = tab * i;
            System.out.println(tab + " * " + i + " = " + resultado);
        }

    }
}
