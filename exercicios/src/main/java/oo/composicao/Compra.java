package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<>();

    void addItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    double getValorTotal(){
        double total = 0.0;
        for (Item item : itens){
            total+= item.quantidade * item.preco;
        }
        return total;
    }
}
