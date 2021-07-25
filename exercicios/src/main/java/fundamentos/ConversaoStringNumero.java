package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane
                        .showInputDialog("Digite o 1° num: ");
        String valor2 = JOptionPane
                .showInputDialog("Digite o 2° num: ");

        System.out.println(valor1 + valor1); // concatenação

        Double valor1conv = Double.parseDouble(valor1);
        Double valor2conv = Double.parseDouble(valor2);

        Double soma = valor1conv + valor2conv;
        System.out.println(soma);
        Double media = soma / 2;
        System.out.printf("Média: %.2f",media);

    }
}
