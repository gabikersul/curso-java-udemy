package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1° salário: ");
        String salario1 = scanner.nextLine();
        System.out.println("Digite o 2° salário: ");
        String salario2 = scanner.nextLine();
        System.out.println("Digite o 3° salário: ");
        String salario3 = scanner.nextLine();


        Double salario1c = Double.parseDouble(salario1.replace(",","."));
        Double salario2c = Double.parseDouble(salario2.replace(",","."));
        Double salario3c = Double.parseDouble(salario3.replace(",","."));

        Double media = (salario1c + salario2c + salario3c) / 3;

        System.out.printf("Média salário: %.2f", media);

        scanner.close();
    }
}
