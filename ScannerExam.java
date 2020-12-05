import java.util.Scanner;

public class ScannerExam {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    Integer a = Integer.parseInt(sc.nextLine());
    System.out.println("Enter a string:");
    String b = sc.nextLine();
    System.out.println("Integer " + a);
    System.out.println("String " + b);
   } 
}