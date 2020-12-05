import java.util.Scanner;
public class AreaTest {
    private double length, breadth;
    public AreaTest()
    {
        length=5;
        breadth=5;
    }
    public AreaTest(double l, double b)
    {
        length=l;
        breadth=b;
    }
    public double computeArea()
    {
        return length*breadth;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double l, b;
        System.out.println("Enter the length of the rectangle");
        l=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        b=sc.nextDouble();
        AreaTest ob=new AreaTest();
        AreaTest ob1=new AreaTest(l, b);
        double ar1, ar2;
        ar1=ob.computeArea();
        ar2=ob1.computeArea();
        System.out.format("Area of the default constructor object: %.2f\n", ar1);
        System.out.format("Area of the paramerized constructor object: %.2f", ar2);
    }
}
