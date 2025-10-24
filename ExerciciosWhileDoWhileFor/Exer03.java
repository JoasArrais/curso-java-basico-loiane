
import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean dadosValidos = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.printf("Infome seu nome: ");
            nome = scanner.next();

            if (nome.length() <= 3){
                dadosValidos = false;
                System.out.println("Nome do Usuario deve conter mais que 3 caracteres");
            } else {
                dadosValidos = true;
                System.out.println("Nome registrado!");
            }
        } while (!dadosValidos);

        do{
            System.out.printf("Infomer sua idade: ");
            idade = scanner.nextInt();

            if (idade > 150){
                dadosValidos = false;
                System.out.println("Informe um valor valido!");
            } else {
                dadosValidos = true;
                System.out.println("Idade registrada!");
            }

        } while (!dadosValidos);

        do{
            System.out.printf("Infome seu salário: ");
            salario = scanner.nextDouble();

            if (salario <= 0 ){
                dadosValidos = false;
                System.out.println("Informe um valor valido!");
            } else {
                dadosValidos = true;
                System.out.println("Valor Registrado!");
            }

        } while (!dadosValidos);

        do{
            System.out.printf("Informe o seu Sexo: ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                dadosValidos = true;
                System.out.println("Informação Registrada");
            } else {
                dadosValidos = false;
                System.out.println(" Informe um valor valido!");
            }

        } while (!dadosValidos);

        do{
            System.out.printf("informe seu estado Civil [ S - Solteiro | C - Casado | V - Viuvo | D - Divociado]: ");
            estadoCivil = scanner.next();

            if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                dadosValidos = true;
                System.out.println("Informação Registrada!");
            } else {
                dadosValidos = false;
                System.out.println("Informe uma opção valida!");
            }


        } while (!dadosValidos);

        System.out.println("======= Informações Coletadas ======= ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

    }


}
