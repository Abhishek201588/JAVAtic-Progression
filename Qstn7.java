class Test{
    String x;
    Test(String x) {
        this.x = x;
    }
}
public class Qstn7{
    public static Test Obj(String x) {
        return new Test(x);
    }
    public static void main(String[] args) {
        Test obj = Obj("Cristiano Ronaldo");
        System.out.println("NAME: "+obj.x);
    }
}