import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("============== Aumento de Salario ==============");
        System.out.printf("Informe seu salario atual: ");
        double salario = scanner.nextDouble();

        double aumentoVinte = (salario / 100) *20;
        double aumentoQuin = (salario / 100) * 15;
        double aumentoDez = (salario / 100) * 10;
        double aumentoCinc = (salario / 100) * 5;

        if (salario <= 280){
            System.out.println("Salário atual " + salario  + "\nSerá Incluído aumento de 20% \nAumento: " + aumentoVinte + "\nNovo salário: " + (aumentoVinte + salario ));
        } else if (salario > 280 && salario <= 700 ){
            System.out.println("Salário atual " + salario  + "\nSerá Incluído aumento de 15% \nAumento: " + aumentoQuin + "\nNovo salário: " + (aumentoQuin  + salario ));
        } else if (salario >= 700 && salario < 1500){
            System.out.println("Salário atual " + salario  + "\nSerá Incluído aumento de 10% \nAumento: " + aumentoDez + "\nNovo salário: " + (aumentoDez + salario ));
        } else {
            System.out.println("Salário atual " + salario + "\nSerá Incluído aumento de 5% \nAumento: " + aumentoCinc + "\nNovo salário: " + (aumentoCinc + salario ));
        }
    }
}
