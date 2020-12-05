import java.io.*;
public class As5Q3{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String str;
        System.out.println("Enter a String:");
        str=in.readLine();
        System.out.println("The length of the string is: " + str.trim().length());
    }
}