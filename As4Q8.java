class A 
{
    A() 
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
class B extends A 
{
    B() 
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
public class As4Q8
{
    public static void main(String[] args) 
    {
        new B();
    }
}
