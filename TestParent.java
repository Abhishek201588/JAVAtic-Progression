class Parent
{
    private String name, add;
    public long id;
    public Parent(String n, String a, long i)
    {
        name=n;
        add=a;
        id=i;
    }
    public void display()
    {
        System.out.println("\nName: " + name + "\nId: " + id);
        System.out.println("Address: " + add);
    }
}
class ChildOne extends Parent
{
    private double marks;
    public ChildOne(String n, String a, long i, double m)
    {
        super(n,a,i);
        marks=m;
    }
    public void display()
    {
        super.display();
        System.out.println("\nMarks: " + marks);
    }
}
class ChildTwo extends Parent
{
    private double salary;
    private String qualification;
    public ChildTwo(String n, String a, long i, double s,String q)
    {
        super(n,a,i);
        salary=s;
        qualification=q;
    }
    public void display()
    {
        super.display();
        System.out.println("\nQualification: "+qualification + "\nSalary: " + salary);
    }
}
public class TestParent
{
            public static void main(String[] args) {
            Parent ob = new Parent("Abhishek Pal" , "Chinsurah Hooghly", 10);
            ChildOne ob1 = new ChildOne("Abhi" , "Chinsurah Hooghly" , 18 , 80);
            ChildTwo ob2 = new ChildTwo("Shek" , "Chinsurah Hooghly", 20 , 30000, "B.Tech");
            ob.display();
            ob1.display();
            ob2.display();
        }
}