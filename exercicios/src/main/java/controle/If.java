package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        if(media >= 7.0 && media <= 10){
            System.out.println("Aprovado!");
        }
        if(media < 7.0 && media >= 4.5){
            System.out.println("Recuperação!");
        }
        if(media < 4.5 && media >= 0){
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
