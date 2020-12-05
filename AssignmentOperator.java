import java.util.Scanner;
public class AssignmentOperator
{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        a = a + 5;
        System.out.println("x = " + a);
        a = a - 5;
        System.out.println("x = " + a);
        a = a * 5;
        System.out.println("x = " + a);
        a = a / 5;
        System.out.println("x = " + a);
        a = a % 5;
        System.out.println("x = " + a);
    }
}
