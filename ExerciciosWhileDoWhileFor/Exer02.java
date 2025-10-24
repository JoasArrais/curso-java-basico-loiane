

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean senhaValida = false;
        String nomeUser;
        String senha;

        do {
            System.out.printf("Entre como nome do seu usuario: ");
            nomeUser = scanner.next();

            System.out.printf("Entre com uma senha: ");
            senha = scanner.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                senhaValida = false;
                System.out.println("A senha não pode ser igual ao nome de Usuario, tente novamnte!");
            } else {
                senhaValida = true;
                System.out.println("Acesso concedido! Bem vindo " + nomeUser);
            }

        } while (!senhaValida);



    }


}
