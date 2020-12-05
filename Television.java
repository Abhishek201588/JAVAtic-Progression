import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Television {
    String maker;
    int size;
    Date purchaseDate;
    boolean isColorTV;
    public Television(String maker, int size, Date purchaseDate, boolean isColorTV) {
        this.maker = maker;
        this.size = size;
        this.purchaseDate = purchaseDate;
        this.isColorTV = isColorTV;
    }
    static String showDate(Date d) {
        return d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getYear();
    }
    void show() {
        System.out.println("\nMaker: "+ maker+"\nSize Inch: "+size+"\nPurchase Date : "+showDate(purchaseDate)+"\ncolor TV: "+isColorTV);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the name of the Company: ");
        String name = sc.next();
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        System.out.print("Is the TV color or not: ");
        boolean tv = sc.nextBoolean();
        Television t=new Television(name,size,new Date(2019 ,9,23),tv);
        t.show();
    }
}