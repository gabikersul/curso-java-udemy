package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Gabriela"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Eva"));
        lista.add(new Usuario("Joelma"));
        lista.add(new Usuario("Britney"));

        System.out.println(lista.get(3).nome);
        lista.remove(3);
        lista.remove(new Usuario("Britney"));

        System.out.println(lista.contains(new Usuario("Lucas")));

        for(Usuario usuario : lista){
            System.out.println(usuario.nome);
        }


    }
}
