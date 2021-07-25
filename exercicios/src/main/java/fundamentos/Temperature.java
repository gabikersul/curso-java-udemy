package fundamentos;

public class Temperature {
    public static void main(String[] args) {
        double temperature_celsius = 10;
        double temperature_fahrenheit = 86;
        final int THIRTY_TWO = 32;
        final double NINE_FIFTHS = 9.0/5.0;
        final double FIVE_NINTHS = 5.0/9.0;

        double celsius_to_fahrenheit = (temperature_celsius * NINE_FIFTHS) + THIRTY_TWO;
        double fahrenheit_to_celsius = (temperature_fahrenheit - THIRTY_TWO) * FIVE_NINTHS;

        System.out.println(celsius_to_fahrenheit + "ºF");
        System.out.println(fahrenheit_to_celsius+ "ºC");
    }


}
