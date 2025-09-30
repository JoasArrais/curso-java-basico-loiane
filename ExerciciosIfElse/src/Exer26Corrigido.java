import java.util.Scanner;

public class Exer26Corrigido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("============= Folha de Pagamento=============");
        System.out.printf("Informe o seu valor hora: ");
        double valorHora = scanner.nextDouble();

        System.out.printf("Informe a quantidade de horas trabalhadas: ");
        double horasTrab = scanner.nextDouble();

        double salarioBruto = horasTrab * valorHora;

        int percentualIR = 0;

        if (salarioBruto <= 900) {
            percentualIR = 0;

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;

        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;

        } else if (salarioBruto > 2500) {
            percentualIR = 10;

            double ir = (salarioBruto / 100) * percentualIR;
            double inss = (salarioBruto * 100) / 10;
            double fgts = (salarioBruto * 100) / 11;
            double totalDescontos = ir + inss;
            double salarioLiq = salarioBruto - totalDescontos;

            System.out.println("Salário Bruto:   ( " + valorHora + " * " + horasTrab + ")  : R$  " + salarioBruto);
            System.out.println("( - )  IR  (" + percentualIR + ")                             : R$  " + percentualIR);
            System.out.println("( - )  INSS  (" + percentualIR + ")                          : R$  " + inss);
            System.out.println("FGTS   (11%)                                    : R$  " + fgts);
            System.out.println("Total de descontos                              : R$  " + totalDescontos);
            System.out.println("Salário Liquido                                 : R$  " + (salarioLiq));

        }
    }
}
