public class Exception2
{
 static void checkAge(int age)
 {
  if(age<18)
  {
   throw new ArithmeticException("Access denied - You must be atleast 18 yrs old");
  }
  else
  {
   System.out.println("Access granted - You are old enough!");
  }
 }
 public static void main(String args[])
 {
  checkAge(15);
 }
}