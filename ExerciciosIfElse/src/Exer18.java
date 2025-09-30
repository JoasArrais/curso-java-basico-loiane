import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.printf("Informe uma letra: ");
            String letra = scanner.nextLine();

           if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
              System.out.println("Esta letra: " + letra + "uma vogal!");
            } else {
                System.out.println("Esta letra " + letra + " é uma consoante!");
            }

        }


    }
