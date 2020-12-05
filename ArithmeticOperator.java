import java.util.Scanner;
public class ArithmeticOperator 
{
    public static void main(String[] args) 
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        int c, d;
        System.out.println("Add: " + (a+b));
        System.out.println("Sub: " + (a-b));
        System.out.println("Mul: " + (a*b));
        System.out.println("Div: " + (a/b));
        System.out.println("Mod: " + (a%b));

        c = b++; d = b--;
        System.out.println("Post ++: " + c);
        System.out.println("Post --: " + d);
        
        c = ++b; d = --b;
        System.out.println("Pre ++: " + c);
        System.out.println("Pre --: " + d);

    }
}
