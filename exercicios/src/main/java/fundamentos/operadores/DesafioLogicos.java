package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // TRabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // se os dois derem certo tv 50 se um der certo tv 32 mas toma sorvete nois dois

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;

        System.out.println("Comprou tv50: " + comprouTv50);
        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;

        System.out.println("Comprou tv32: " + comprouTv32);

        boolean tomouSorvete = comprouTv32 || comprouTv50;

        System.out.println("Tomou sorvete: " + tomouSorvete);

        System.out.println("Mais saudável? " + !tomouSorvete);

    }
}
