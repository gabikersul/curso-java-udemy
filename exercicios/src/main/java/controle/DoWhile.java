package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Vc precisa falar as palavras mágias...");
            System.out.println("Quer sair?");
            texto = scanner.nextLine();

        }while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");

        scanner.close();
    }
}
