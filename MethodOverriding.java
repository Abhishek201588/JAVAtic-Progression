class Student
{
    void doWork()
    {
        System.out.println("Student Specific Work");
    }
}

class UGStudent extends Student
{
    
    @Override
    void doWork() 
    {
        System.out.println("UG Student Specific Work");
    }
}

public class MethodOverriding 
{
    public static void main(String[] args)
    {
        Student ob = new Student();
        ob.doWork();
        UGStudent obj = new UGStudent();
        obj.doWork();
    }
}
