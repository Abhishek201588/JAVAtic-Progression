import java.io.*;

  class DeleteMethod
  {
       void del(String str,int m)
       {
              char c;
              String s1,s2;
              int len=str.length();
              if (m>len)
                System.out.println("Invalid");
              else
              {
                  s1=str.substring(0,m-1);
                  s2=str.substring(m);
                  System.out.print("Your Updated String is  "+s1+s2);
             }
       }
  };

class As5Q9
{
    public static void main(String args[]) 
    {
       DeleteMethod ob = new DeleteMethod();
       String str,s;
       int m;

       try{
            BufferedReader obj = new BufferedReader(new InputStreamReader

(System.in));
            System.out.print("\nEnter String : ");
            str=obj.readLine();
            System.out.print("Enter character position which you want to delete : ");
            s=obj.readLine();
            m=Integer.parseInt(s);
            ob.del(str,m);
            }
        catch(Exception e)
        {}

    }
}