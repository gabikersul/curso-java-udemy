package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";

        while(!frase.equalsIgnoreCase("sair") ){
            System.out.println("Você diz: ");
            frase = scanner.nextLine();
        }
        scanner.close();
    }
}
