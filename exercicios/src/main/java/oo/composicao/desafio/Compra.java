package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public void addItem(Item item){
        itens.add(item);
    }

    public Double valorTotalItens(){
        Double total = 0.0;
        for (Item item : itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }



}
