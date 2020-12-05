public class MainCall 
{
    public static void main(String[] args)
    {
        System.out.println("This is the String args main");
        main(25);
    }
    public static void main(int a)
    {
        System.out.println("This is the int main");
    }
}class Over
{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static String add(String a, String b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        int ans=add(9, 14);
        double ans1=add(5.6, 8.1);
        String s=add("Abhishek", "Pal");
        System.out.format("Integer addition-%d \nDecimal addition-%.2f \nString addition-%s", ans, ans1, s);
    }
}