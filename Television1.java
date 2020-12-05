import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Television1 {
    String maker;
    int size;
    Date purchaseDate;
    boolean iscolorTV;
    public Television1(String maker, int size, Date purchaseDate, boolean iscolorTV) {
        this.maker = maker;
        this.size = size;
        this.purchaseDate = purchaseDate;
        this.iscolorTV = iscolorTV;
    }
    static String showDate(Date d) {
        return d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getYear();
    }
    void show() {
        System.out.println("Maker name: "+ maker+"\nSize: "+size+"\npurchase date : "+showDate(purchaseDate)+"\niscolortv: "+iscolorTV);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value maker name :");
        String name = sc.next();
        System.out.print("Enter the Size :");
        int size = sc.nextInt();
        System.out.print("Say the tv is color or not :");
        boolean tv = sc.nextBoolean();
        Television t=new Television(name,size,new Date(2011 ,6,24),tv);
        t.show();
    }
}
