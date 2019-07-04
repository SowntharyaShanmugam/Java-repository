class Doctor
{
 void Doctor_Details()
 {
  System.out.println("Doctor details are");
 }
}
class Surgeon extends Doctor
{
 void Surgeon_Details()
 {
  System.out.println("Surgeon details are");
 }
}
public class Inheritance
{
 public static void main(String args[])
 {
  Surgeon s=new Surgeon();
  s.Doctor_Details();
  s.Surgeon_Details();
 }
}