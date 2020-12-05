public class Temp{
    public static void main(String[] args) {
        double farenheit = Double.parseDouble(args[0]);
        double celcius = (farenheit - 32) / 1.8;
        System.out.println("Celcius: " + celcius);
    }
}