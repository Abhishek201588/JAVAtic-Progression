import java.util.Scanner;
public class Quadratic{
 public static void main(String[] args)
 {
 Scanner in=new Scanner(System.in);
 double a, b, c, r1, r2;
 System.out.println("Enter the value of a");
 a=in.nextDouble();
 System.out.println("Enter the value of b");
 b=in.nextDouble();
 System.out.println("Enter the value of c");
 c=in.nextDouble();
 r1=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
 r2=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
 System.out.format("R1: %.2f R2: %.2f",r1,r2);
 }
}