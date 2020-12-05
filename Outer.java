class Outer 
{
    String name = "Abhishek Pal";
    void show() {
        System.out.println("Outer class");
        System.out.println("\nName : " + name);
}
public class Inner 
{
    String Player = "Striker";

    void display() 
    {
        System.out.println("\nInner class");
        show();
        System.out.println("Position :" + Player);
    }
}
    public static void main(String[] args)
    {
        new Outer().show();
        new Outer().new Inner().display();
    }
}