class Exception1
{
 public static void main(String args[])
 {
  int d=0;
  int n=20;
  try
  {
   int fraction=n/d;
   System.out.println("This line cannot be executed");
  }
  catch(ArithmeticException e)
  {
   System.out.println("Something went wrong");
  }
  finally
  {
   System.out.println("'Try' and 'catch' finished");
  }
  System.out.println("End of main");
 }
}