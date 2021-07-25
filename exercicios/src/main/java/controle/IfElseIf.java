package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = scanner.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota inválida!");
        } else if(nota >= 8.1){
            System.out.println("Nota A");
        } else if (nota >= 6.1){
            System.out.println("Nota B");
        } else{
            System.out.println("Nota C");
        }


        scanner.close();
    }
}
