package lambidas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional: ");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nForma chique: ");
        aprovados.forEach(nome -> {
            System.out.println(nome);
        });

        System.out.println("\nForma chique (Method Reference): ");
        aprovados.forEach(System.out::println);

        System.out.println("\nForma chique personalizada: ");
        aprovados.forEach(ForEach::meuImprimir); //Nunca tinha usado assim :O

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi, meu nome é: " + nome);
    }

}