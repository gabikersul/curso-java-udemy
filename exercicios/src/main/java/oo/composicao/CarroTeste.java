package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(carro.estaLigado());

        System.out.println(carro.motor.giros());

        carro.ligar();

        System.out.println(carro.estaLigado());

        System.out.println(carro.motor.giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        // Faltou Encapsulamento!!
        //carro.motor.fatorInjecao = -20;

        System.out.println(carro.motor.giros());




    }
}
