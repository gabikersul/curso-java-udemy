package classes;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joana",60);
        Comida feijão = new Comida("feijão",0.200);
        Comida arroz = new Comida("arroz",0.100);

        System.out.println(pessoa.peso);

        pessoa.comer(feijão);
        System.out.println(pessoa.peso);

        pessoa.comer(arroz);
        System.out.println(pessoa.peso);

    }
}
