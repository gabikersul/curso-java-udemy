package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); // pega a letra na posição

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarDe"));


        String nome = "João Pedro";
        String sobrenome = "Lima";
        int idade = 21;
        double salario = 12000.00;

        String frase = String.format("O Sr. %s %s tem %d anos e ganha R$%.2f .", nome, sobrenome, idade, salario);
        System.out.println(frase);

        //System.out.printf("O Sr. %s %s tem %d anos e ganha R$%.2f .", nome, sobrenome, idade, salario);
    }
}
