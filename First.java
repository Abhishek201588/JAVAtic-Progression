public class First{
    String x;
    First(String x) {
        this.x = x;
    }
    void show(){
        System.out.println("Print");
    }
    public static void main(String[] args) {
        First obj = new First("Abhishek");
        obj.show();
        System.out.println(obj.x);
    }
}