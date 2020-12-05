class A 
{
    void show() 
    {
        System.out.println("Class A");
    }
}

class B extends A 
{
    @Override
    void show() 
    {
        System.out.println("Class B");
    }    
}

class C extends B
{
    @Override
    void show() 
    {
        System.out.println("Class C");
    }
}

public class Qstn4
{
    public static void main(String[] args) 
    {
        A a = new A();
        a.show();
        B b = new B();
        b.show();
        C c = new C();
        c.show();
    }
}