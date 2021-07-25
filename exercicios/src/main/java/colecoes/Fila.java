package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Diferença no comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna falso
        fila.offer("Bia"); // lança exception
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //próximo elemento na fila
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.element()); // lança exception

        //fila.clear();
        //fila.isEmpty();
        //fila.contains();
        //fila.size();

        //remove
        System.out.println(fila.poll()); //retorna nulo
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança exception

    }
}
