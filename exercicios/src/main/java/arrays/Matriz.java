package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int qtdAlunos = scanner.nextInt();
        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = scanner.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int i = 0; i < notasTurma.length; i++){
            for(int j = 0; j < notasTurma[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasTurma[i][j] = scanner.nextDouble();
                total += notasTurma[i][j];
            }
        }
        double media = total / ( qtdAlunos * qtdNotas);
        System.out.println("Média turma: " + media);

        for(double[] notasALuno: notasTurma){
            System.out.println(Arrays.toString(notasALuno));
        }
        scanner.close();
    }
}
