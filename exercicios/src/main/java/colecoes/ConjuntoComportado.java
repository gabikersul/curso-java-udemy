package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> lista = new TreeSet<>(); //aceita ordenação em ordem de inserção

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Pedro");

        for(String candidato : lista){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); //ordena por ordem crescente
        nums.add(6);
        nums.add(5);
        nums.add(3);

        for(Integer num : nums){
            System.out.println(num);
        }


    }
}
