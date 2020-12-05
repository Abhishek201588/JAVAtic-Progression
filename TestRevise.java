class Test{
    String x;
    Test(String x) {
        this.x = x;
    }
    void show(Test obj){
        System.out.println("Print X:"+ obj.x);
    }
    public static void main(String[] args) {
        Test obj = new Test("Abhishek");
        obj.show(obj);
    }
}
public class TestRevise{
    public static void main(String[] args) {
        Test obj = new Test("  Abhi");
        obj.show(obj);
    }
}