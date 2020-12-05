public class Garbage
{
    protected void finalize() throws Throwable
    {
        System.out.println("finalize() is called");
    }

    public static void main(String[] args)
    {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();
        obj1 = null;
        obj2 = null;
        System.gc();
    }
}