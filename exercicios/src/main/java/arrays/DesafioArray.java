package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de notas: ");

        int quantidadeNotas = scanner.nextInt();
        double[] notasAluno = new double[quantidadeNotas];

        for(int i = 0; i < notasAluno.length; i++){
            System.out.print("Digite a "+ (i + 1) + "°" + " nota: ");
            notasAluno[i] = scanner.nextDouble();
        }

        double total = 0;
        for(double nota : notasAluno){
            total+= nota;
        }
        System.out.println(total / quantidadeNotas);

        scanner.close();

    }
}
