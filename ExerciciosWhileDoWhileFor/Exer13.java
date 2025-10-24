import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe o numero base: ");
        int base = scan.nextInt();

        System.out.printf("Informe o expoente: ");
        int expoente = scan.nextInt();

        int result = base;

        for (int i = 1; i < expoente; i++) {
            result  *= base;

        }
        System.out.println(result);
    }
}
