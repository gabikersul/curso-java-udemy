package lambidas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        // não pode usar classes primitivas

        BinaryOperator<Double> calc = (x, y) ->  { return x + y; }; //representa uma operação que recebe dois params de mesmo tipo do retorno.
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y; //implicitamente existe um return.

        System.out.println(calc.apply(2.0, 3.0));

    }
}
