abstract class Shape{
    double pi;
    Shape(){
        pi = 3.142;
    }
    void show() {
        System.out.println("PI: " + pi);
    }
    abstract double area(double height, double width);
}

class Circle extends Shape {
    double area(double height, double width) {
        return (pi * height * width);
    }
}

class Rectangle extends Shape {
    double area(double height, double width) {
        return (width * height);
    }
}

public class AreaAbstract{
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.show();
        System.out.println("Area 1: " + s.area(5,5));
        s = new Rectangle();
        s.show();
        System.out.println("Area 2: " + s.area(4,6));
    }
}