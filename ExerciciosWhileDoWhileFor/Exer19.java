import java.util.Scanner;

public class Exer19 {    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o numero de notas: ");
    double notas = scan.nextDouble();

    double soma = 0;
    double media = 0;
    double nota;


    for (int i = 0; i < notas; i++){
        System.out.println("Informe o valor da nota: " + (i+1));
        nota = scan.nextDouble();

        soma += nota;

    }

     media = soma / notas;
    System.out.println("Soma: " + soma);
    System.out.println("media: " + media);

  }

}