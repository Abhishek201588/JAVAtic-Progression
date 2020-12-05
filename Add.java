import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CommandLineEx{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum is " + (a + b));
    }
}

class ScannerEx{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Sum is " + (a + b));
        sc.close();
    }
}

class BufferReader{
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number: ");
        int a = Integer.parseInt(buf.readLine());
        System.out.println("Enter 2nd number: ");
        int b = Integer.parseInt(buf.readLine());
        System.out.println("Sum is " + (a + b));
    }
}
