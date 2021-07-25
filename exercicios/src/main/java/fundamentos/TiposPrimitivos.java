package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Viagens feitas
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        //Salario
        System.out.println(id + ": ganha: R$" + salario);

        // Ferias
        System.out.println("Está de férias? " + estaDeFerias);

        // Status
        System.out.println("Status: " + status);
    }
}
