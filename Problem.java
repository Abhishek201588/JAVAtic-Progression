class Anonymous
{
    void show() 
    {
        System.out.println("Super class method");
    }
}
 
interface A 
{
    public Anonymous get();
}
 
class B implements A 
{
    public Anonymous get() 
    {
        return new Anonymous() 
        {
            void show() 
            {
                System.out.println("Overridden method");
            }
        };
    }
}
 
public class Problem 
{
    public static void main(String[] args) {
        new B().get().show();
    }
}
