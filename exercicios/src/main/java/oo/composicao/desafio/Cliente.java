package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();


    public Cliente(String nome){
        this.nome = nome;
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public Double totalGasto(){
        Double total = 0.0;

        for(Compra compra : compras){
            total +=compra.valorTotalItens();
        }
        return total;
    }


}
