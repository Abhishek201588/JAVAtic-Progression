import java.util.Scanner;
public class Fibonacci{
	public static int fibonacciRecursion(int a){
	if(a==0){
		return 0;
	}
	if(a==1 ||a==2){
			return 1;
		}
	return fibonacciRecursion(a-2) + fibonacciRecursion(a-1);
	}
           public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter nth term: ");
            Integer n = Integer.parseInt(sc.nextLine());
	System.out.print("Fibonacci: ");
	for(int i=0;i<n;i++){
			System.out.print(fibonacciRecursion(i)+" ");
		}
	}
}
