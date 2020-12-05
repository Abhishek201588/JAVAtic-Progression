import java.util.Scanner;
public class As5Q10
{
    public static void main(String[] args) 
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Who is the inventor of JAVA?");
        for(i=1;i<=3;i++)
        {
            String a=sc.nextLine();
            if(a.equalsIgnoreCase("James Gosling"))
            {
                System.out.println("Good");
                break;
            else
            {
                System.out.println("Try Again");
            }
        }
            if(i==4)
            {
                System.out.println("James Gosling is the inventor of JAVA");
            }        
    }        
}