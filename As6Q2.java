class As6Q2
{
   public static void main(String args[])
   {
      try{
        int a[]=new int[10];
        a[11] = 9;
        String str="Skyisblue";
   char c = str.charAt(0);
   c = str.charAt(40);
   System.out.println(c);
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
      catch(StringIndexOutOfBoundsException e){
    System.out.println("StringIndexOutOfBoundsException!!");
       }
   }
}