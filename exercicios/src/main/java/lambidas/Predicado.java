package lambidas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isExpensive = produto -> produto.preco * (1 - produto.desconto) >= 750.00;

        Produto produto = new Produto("PS4", 2500, 0.85);
        System.out.println(isExpensive.test(produto));

    }

}