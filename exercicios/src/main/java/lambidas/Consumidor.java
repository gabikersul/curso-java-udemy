package lambidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Produto p1 = new Produto("Skin da Morgana", 34.00, 0.10);
        Produto p2 = new Produto("Skin da Xayah", 34.00, 0.10);
        Produto p3 = new Produto("Skin do Rakan", 34.00, 0.10);
        Produto p4 = new Produto("Skin da Lux", 34.00, 0.10);
        Produto p5 = new Produto("Skin do Heimer", 34.00, 0.10);

        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);

        List<Produto> produtoList = Arrays.asList(p1, p2, p3, p4, p5);

        produtoList.forEach(imprimirNome);

        produtoList.forEach(System.out::println);
    }
}