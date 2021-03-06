import java.util.Scanner;

public class Tree {
    int id;
    String name;
    double height, width, amount;

    Tree(int id, String name, double height, double width, double amount) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    void annualUpdate(double height, double width, double amount) {
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    public String toString() {
        return "id = " + this.id + " name = " + this.name + " height = " + this.height + " width = " + this.width
                + " amount = " + this.amount;
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Height: ");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("Enter Width: ");
        double width = Double.parseDouble(input.nextLine());
        System.out.println("Enter Amount: ");
        double amount = Double.parseDouble(input.nextLine());

        Tree obj = new Tree(id, name, height, width, amount);
        System.out.println("Tree: " + obj);

    }
}