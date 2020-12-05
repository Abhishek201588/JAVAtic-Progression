interface Shape {
    double pi = 3.14;
    double compArea(double length , double breadth);
    static void showPi() { System.out.println("\nPI = " + Figure.pi); 
}
class Rectangle implements Shape{
    @Override
    public double compArea(double length, double breadth) {
        return length*breadth;
    }    
}
class Circle implements Shape{
    @Override
    public double compArea(double length, double breadth) {
        return pi*length*length;
    }    
}

public class InterfaceArea{
            public static void main(String[] args) {
            Shape.showPi();
            Shape f = new Rectangle();
            System.out.println("\nAREA1 = " + f.compArea(5,6));
            f = new Circle();
            System.out.println("\nAREA2 = " + f.compArea(8,0));
        }
    }
}