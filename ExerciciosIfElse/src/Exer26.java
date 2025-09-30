import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("============= Folha de Pagamento=============");
        System.out.printf("Informe o seu valor hora: ");
        double valorHora = scanner.nextDouble();

        System.out.printf("Informe a quantidade de horas trabalhadas: ");
        double horasTrab = scanner.nextDouble();

        double salarioBruto = horasTrab * valorHora;

        double fgts = (salarioBruto * 11) / 100;
        double inss = (salarioBruto * 10) / 100;

        double ir5 = (salarioBruto * 5) / 100;
        double ir10 = (salarioBruto * 10) / 100;
        double ir20 = (salarioBruto * 20) / 100;
        double isento = (0.00);

        double desconto1 = inss + ir5;
        double desconto2 = inss + ir10;
        double desconto3 = inss + ir20;


        if (salarioBruto <= 900){
            System.out.println("Salário Bruto:   ( " + valorHora + " * " + horasTrab + ")                  : R$  " + salarioBruto);
            System.out.println("( - )  IR  (Isento)                             : R$  " + isento);
            System.out.println("( - )  INSS  (Isento)                           : R$  " + isento);
            System.out.println("FGTS   (11%)                                    : R$  " + fgts);
            System.out.println("Total de descontos                              : R$  " + isento);
            System.out.println("Salário Liquido                                 : R$  " + (salarioBruto - isento));

        } else if (salarioBruto > 900 && salarioBruto <= 1500 ){
            System.out.println("Salário Bruto:   ( " + valorHora + " * " + horasTrab + ")                   : R$  " + salarioBruto);
            System.out.println("( - )  IR  (5%)                                   : R$  " + ir5);
            System.out.println("( - )  INSS  (10%)                                : R$  " + inss);
            System.out.println("FGTS   (11%)                                      : R$  " + fgts);
            System.out.println("Total de descontos                                : R$  " + desconto1);
            System.out.println("Salário Liquido                                   : R$  " + (salarioBruto - desconto1));



        } else if (salarioBruto > 1500 && salarioBruto <= 2500 ){
            System.out.println("Salário Bruto:   ( " + valorHora + " * " + horasTrab + ")                    : R$  " + salarioBruto);
            System.out.println("( - )  IR  (10%)                                  : R$  " + ir10);
            System.out.println("( - )  INSS  (10%)                                : R$  " + inss);
            System.out.println("FGTS   (11%)                                      : R$  " + fgts);
            System.out.println("Total de descontos                                : R$  " + desconto2);
            System.out.println("Salário Liquido                                   : R$  " + (salarioBruto - desconto2));


        } else if (salarioBruto > 2500) {
            System.out.println("Salário Bruto:   ( " + valorHora + " * " + horasTrab + ")                    : R$  " + salarioBruto);
            System.out.println("( - )  IR  (20%)                                  : R$  " + ir20);
            System.out.println("( - )  INSS  (10%)                                : R$  " + inss);
            System.out.println("FGTS   (11%)                                      : R$  " + fgts);
            System.out.println("Total de descontos                                : R$  " + desconto3);
            System.out.println("Salário Liquido                                   : R$  " + (salarioBruto - desconto3));

        }
    }

}
