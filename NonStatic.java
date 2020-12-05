public class NonStatic{
    int id;
    static String name = "Non-static";

    NonStatic(int id) {
        this.id = id;
    }

    public String toString() {
        return "id = " + this.id + " name = " + NonStatic.name;
    }
    public static void main(String[] args) {
        NonStatic obj1 = new NonStatic(66);
        NonStatic obj2 = new NonStatic(07);
        System.out.println("OBJ1 = " + obj1);
        System.out.println("OBJ2 = " + obj2);
    }
}