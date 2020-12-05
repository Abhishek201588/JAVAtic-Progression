public class As4Q7 
{
    public static void main(String[] args) 
    {
        new B();
    }
}
 
class B 
{
    static int a;
    int b;
 
    B() 
    {
        System.out.println("Constructor Block");
    }
 
    static 
    {
        a = 5;
        System.out.println("a=" + a);
    }
    {
         a = 17;
        b = 22;
        System.out.println("a=" + a + " b=" + b);
    }
}
