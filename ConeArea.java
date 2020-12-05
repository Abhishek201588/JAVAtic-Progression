import static java.lang.Math.*;

class Cone
{
   private double radius, height;
    Cone(double r,double h)
    {
        this.radius = r;
        this.height = h;
    }
    double Area()
    {
        return (3.14 * radius * ( radius + sqrt(Math.pow(height,2) + Math.pow(radius,2))));
    }
    double Volume()
    {
        return (3.14*radius*radius*height )/3;
    }
}
public class ConeArea
{
    public static void main(String args[])
    {
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        Cone c1=new Cone(r, h);
        System.out.println("The area of the cone is: " + c1.Area());
        System.out.println("The volume of the cone is: " + c1.Volume());
    }
}