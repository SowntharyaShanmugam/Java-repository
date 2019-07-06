import java.util.Scanner;
class UserInput
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter username,age & salary:");
  String username=s.nextLine();
  int age=s.nextInt();
  double salary=s.nextDouble();
  System.out.println("Username:"+username);
  System.out.println("Age:"+age);
  System.out.println("Salary:"+salary);
 }
}