import java.util.Scanner;
public class PrimeNo
{
    public static boolean Prime(int n)
    {
    int a=0;
    for(int i=2;i<n/2;i++)
    {
        if(n%i==0)
        {
            a++;
        }
    }
        if(a>0)
        { 
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int q,r;
        System.out.println("Enter bottom term");
        q=in.nextInt();
        System.out.println("Enter upper term");
        r=in.nextInt();
        System.out.println("Prime numbers are: ");
        for(int i=q;i<=r;i++)
        {
            if(Prime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }   
}