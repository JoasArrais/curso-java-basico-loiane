import java.util.Scanner;

public class Exer33 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" =========== Escolha a Operação ==========");
        System.out.printf("Informe um numero: ");
        int numero1 = scanner.nextInt();

        System.out.printf("Informe outro numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Qual operação deseja realizar? [ + - / *]: ");
        String operacao = scanner.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao){
            case "+": resultado = numero1 + numero2; break;
            case "-": resultado = numero1 - numero2; break;
            case "*": resultado = numero1 * numero2; break;
            case "/": resultado = numero1 / numero2; break;
            default: System.out.println("Operação invalida");
            valida = false; break;

        }

        if (valida){
           if (resultado >= 0){
               System.out.println("O resultado da operação é Positivo: " + resultado);
           } else {
               System.out.println("O resultado da operação é Negativo: " + resultado);
           }
           if (resultado % 2 == 0){
               System.out.println("O resultado da operação é Par: " + resultado);
           } else {
               System.out.println("O resultado da operação é Ímpar: " + resultado);
           }
        }


    }
}
