class B1
{
    B1() 
    {
        System.out.println("Super constructor");
    }
    {
        System.out.println("Super Initializer block");
    }
    static 
    {
        System.out.println("Super static block");
    }
}
class B2 extends B1 
{
    B2() 
    {
        System.out.println("Sub constructor");
    }
    {
        System.out.println("Sub Initializer block");
    }
    static 
    {
        System.out.println("Sub static block");
    }
}
public class As4Q6 
{
    public static void main(String[] args) 
    {
        new B2();
    }
}
