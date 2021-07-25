package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Boa noite X";
        s = s.replace("X","Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!");
        System.out.println(s);

    }
}
