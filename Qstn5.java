class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Class B");
    }    
}

class C extends A {
    @Override
    void show() {
        System.out.println("Class C");
    }
}

public class Qstn5 {
    public static void main(String[] args) {
        A obj;
        obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}