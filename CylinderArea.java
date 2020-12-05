class Cylinder
{
    private double radius,height;
    Cylinder(double r,double h)
    {
        this.radius=r;
        this.height=h;
    }
    double area()
    {
        return ((2*3.14*radius*radius)+(2*3.14*radius*height));
    }
    double volume()
    {
        return 2*3.14*radius*radius*height;
    }
}
public class CylinderArea
{
    public static void main(String args[])
    {
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        Cylinder a=new Cylinder(r, h);
        System.out.println("The area of the cylinder: " + a.area());
        System.out.println("The volume of the cylinder: " + a.volume());
    }
}