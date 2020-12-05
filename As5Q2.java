import java.io.*;
public class As5Q2{
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String str;
        System.out.println("Enter a String:");
        str=in.readLine();
        char ch[]=new char[8+str.length()];
        ch[0]='A';
        ch[1]='B';
        ch[2]='H';
        ch[3]='I';
        ch[4]='S';
        ch[5]='H';
        ch[6]='E';
        ch[7]='K';
        str.getChars(0, str.length(), ch, 8);
        System.out.println("The output is: ");
        System.out.println(ch);
    }
}