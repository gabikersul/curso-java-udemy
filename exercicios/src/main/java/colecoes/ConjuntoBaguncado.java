package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("Teste")) ;

        System.out.println(conjunto.size());

        System.out.println(conjunto.contains('x'));

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        //conjunto.addAll(nums); //União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);
    }
}
