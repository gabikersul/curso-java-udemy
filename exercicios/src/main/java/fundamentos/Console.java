package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("Megasena: %d %d %d %d %n", 1,2,3,4,5);
        System.out.printf("Salário: %.1f %n", 111.11);
        System.out.printf("Nome: %s %n", "João");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Nome: %s %s Idade: %d", nome, sobrenome, idade);
        System.out.println();

        scanner.close();
    }
}
