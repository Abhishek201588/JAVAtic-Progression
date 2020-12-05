public class BasicInput {
    public static void main(String[]args) throws Exception {
        char ch;
        String str = "";

        System.out.println("Enter a decimal number (press '#' to quit'):");
        while ((ch=(char)System.in.read()) != '#'){
            str += ch;
        }
        double num = Double.parseDouble(str);
        System.out.println("Number= " + num);
    }
}