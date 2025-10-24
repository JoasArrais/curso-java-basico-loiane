import java.util.Scanner;

public class Exer20 {    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.printf("Entre a quantidade de pessoas: ");
    int qtd = scan.nextInt();

    int idade;
    double soma = 0;

    for (int i = 0; i < qtd; i++){
        System.out.println("informe a idade da pessoa: "+ (i+1));
        idade = scan.nextInt();

        soma += idade;
    }

    double media = soma / qtd;

    if (media >= 0 &&  media <= 25){
        System.out.println("A media das idades é: " + media + " Esta é uma turma Jovem! ");
    } else if (media >= 25 && media <= 60) {
        System.out.println("A media das idades é: " + media + " Esta é uma turma Adulta! ");
    } else {
        System.out.println("A media das idades é: " + media + " Esta é uma turma Idosa! ");
    }

   }
}