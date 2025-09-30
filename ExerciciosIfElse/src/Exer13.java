import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o valor que você recebe por hora:  ");
        double valorHora = scanner.nextDouble();

        System.out.printf("Informe a quantidade de horas trabalhadas neste mês: ");
        double quantHoras = scanner.nextDouble();

        double salariobruto = quantHoras * valorHora;
        double improtoRen = (salariobruto / 100) * 11;
        double inss =  (salariobruto / 100 ) * 8;
        double sindicato = (salariobruto / 100) * 5;
        double desconto = inss + improtoRen + sindicato;
        double salarioL = salariobruto - desconto;


        System.out.println("Seu Salário Bruto: " + salariobruto);
        System.out.println("Valor recolhido pelo IR [11%]:" +  improtoRen);
        System.out.println("Valor recolhido pelo Sindicato [8%]: " + sindicato);
        System.out.println("Valor recolhido pelo INSS [8%]: " + inss);
        System.out.println("Valor a receber liquido: " + salarioL);



    }
}
