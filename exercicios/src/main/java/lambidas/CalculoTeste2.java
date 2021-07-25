package lambidas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        Calculo calc = (x, y) ->  { return x + y; };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y; //implicitamente existe um return.

        System.out.println(calc.executar(2, 3));
    }
}
