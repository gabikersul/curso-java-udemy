package classes;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook",4356.89);
        Produto p2 = new Produto();

        Produto.desconto = 0.29;
        p2.nome = "Caneta preta" ;
        p2.preco =  12.56;


        System.out.println(p1.calculaDesconto());
        System.out.println(p2.calculaDesconto());


    }
}
