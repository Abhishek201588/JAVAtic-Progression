import java.util.Scanner;
public class SumAndAverage{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
        int sum=0;
        double avg=0;
        for(int i:a)
        {
            sum+=i;
        }
        avg=(double)sum/n;
        System.out.println("Sum:"+sum);
        System.out.format("Average %.2f:", avg);
    }
}