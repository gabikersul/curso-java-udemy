package oo.composicao.desafio;


public class CompraTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriela");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.addItem(new Item(new Produto("chiclete rosa",7.0), 3));
        compra1.addItem(new Item(new Produto("ração da gata", 25.0), 2));

        System.out.println(compra1.valorTotalItens());

        compra2.addItem(new Item(new Produto("batom vermelho", 40.00), 1));
        compra2.addItem(new Item(new Produto("torradeira", 90.00), 1));

        System.out.println(compra2.valorTotalItens());

        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);



        System.out.println(cliente1.totalGasto());


    }
}
