import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("================= Turno Escolar ================= ");
        System.out.printf("Em qual turno voce estuda? [M - Matutino | V - Vespertino | N - Noturno]: ");
        String turno = scanner.nextLine();

        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Invalido!");
        }
    }
}
