import java.io.*;
public class As5Q4{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String str, search;
        str="University of Technology";
        System.out.println("Enter the subsequence to be searched:");
        search=in.readLine();
        if(str.contains(search))
        {
            System.out.println("Search found");
        }
        else
        {
            System.out.println("Search not found");
        }
    }
}
