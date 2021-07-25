package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double numA = 6 * (3 + 2);
        double numAValue = Math.pow(numA,2);
        double result1 = numAValue / (3 * 2);

        System.out.println(result1);

        double numB = (1-5) * (2 - 7);
        double numBValue = numB / 2;
        double result2 = Math.pow(numBValue,2);

        System.out.println(result2);

        double numC = Math.pow(result1 - result2,3);
        System.out.println(numC);

        double result3 = numC / Math.pow(10,3);
        System.out.println(result3);




    }
}
