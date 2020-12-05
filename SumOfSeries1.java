import java.util.Scanner;
public class SumOfSeries1
{
 public static void main(String[] args)
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the value of nth term");
 int n=in.nextInt();
 System.out.println("Enter the value of a");
 int a=in.nextInt();
 int sum=0;
 for(int i=0;i<=n;i++)
 {
 sum+=Math.pow(a, i);
 }
 System.out.println("The sum: "+sum);
}}