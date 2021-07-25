package fundamentos;

public class Wrapper {
    public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);

        //byte
        Byte b = 100;
        Short s = 1000;
       // Integer i = Integer.parseInt(scanner.nextLine());
        Integer i = 10000;
        Long l = 10000L;
        Boolean bo = Boolean.parseBoolean("true");
        Character c = '#';
        Float f = 123.0f;
        Double d = 1234.5678;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(bo);
        System.out.println(c.toString());

       // scanner.close();
    }
}
