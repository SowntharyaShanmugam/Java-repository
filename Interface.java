interface Animal
{ 
 public void animalSound();
 public void sleep();
}
class Pig implements Animal
{
 public void animalSound()
 {
  System.out.println("The pig sounds wee wee");
 }
 public void sleep()
 {
  System.out.println("zzz");
 }
}
class Interface
{
 public static void main(String args[])
 {
  Pig p=new Pig();
  p.animalSound();
  p.sleep();
 }
}