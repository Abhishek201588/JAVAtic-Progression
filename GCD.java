import java.util.Scanner;
public class GCD{
    public static int gcd(int a, int b){
        if(b!= 0)
            return gcd(b, a % b);
        return a;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt(input.nextLine());
        if(a<b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        System.out.printf("GCD is: %d",gcd(a,b));
    }
}