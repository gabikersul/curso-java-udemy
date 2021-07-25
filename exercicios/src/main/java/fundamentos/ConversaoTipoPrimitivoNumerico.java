package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // implícita
        int f = (int) a;
        System.out.println(f);

        float b = (float) 1.50; // explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);


    }
}
