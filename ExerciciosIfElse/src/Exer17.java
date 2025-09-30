import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe seu sexo [F/M]: ");
        String sexo = scanner.nextLine();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("M")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo invalido");
        }


    }


}
