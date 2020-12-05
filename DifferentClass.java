class First{
    int x;
    First(int x) {
        this.x = x;
    }
    void show(){
        System.out.println("Print");
    }
}
public class DifferentClass{
    public static void main(String[] args) {
        First obj = new First(66);
        obj.show();
        System.out.println(obj.x);
    }
}