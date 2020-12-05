class As6Q1
{
   public static void main(String args[])
   {
      try{
         int n1=30, n2=0;
         int d=n1/n2;
         System.out.println ("Result: "+d);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   }
}