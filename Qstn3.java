class Employee 
{
    int id;
    String name;
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public String toString() 
    {
        return "\nId = " + this.id + "\nname = " + this.name;
    }
}

class Scientist extends Employee 
{
    int publication;
    String experience;
    Scientist (int id, String name, int publication, String experience) 
    {
        super(id, name);
        this.publication = publication;
        this.experience = experience;
    }
    public String toString() 
    {
        return super.toString() + " \nPublications = " + this.publication + " \nExperience = " + this.experience;
    }
}

public class Qstn3 extends Scientist 
{
    String awards;
    Qstn3(int id, String name, int publication, String experience, String awards) 
    {
        super(id, name, publication, experience);
        this.awards = awards;
    }
    public String toString() 
    {
        return super.toString() + "\nAwards = " + this.awards ;
    }
    public static void main(String[] args) 
    {
        Scientist d = new Qstn3(1, "Abhishek Pal", 66, "Research Manager", "Employee");
        Scientist f = new Qstn3(2, "Swapnanil Dutta", 12, "Assistant Manager", "Employee");
        Scientist g = new Qstn3(3, "Suchetana Sheet", 16, "Junior Scientist", "Employee");

        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
    }
}