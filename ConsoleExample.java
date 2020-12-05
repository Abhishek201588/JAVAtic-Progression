import java.io.Console;

public class ConsoleExample {
    public static void main(String[]args){
        Console reader = System.console();
        System.out.println("Enter a string: ");
        String a = reader.readLine();
        System.out.println("Enter an integer: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("String= " + a);
        System.out.println("Integer= " + b);
    }

}