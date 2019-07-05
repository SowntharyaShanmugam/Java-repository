abstract class Animal
{
 public abstract void animalSound();
 public void sleep()
 {
  System.out.println("ZZZ");
 }
}
class Pig extends Animal
{
 public void animalSound()
 {
  System.out.println("The pig says wee wee");
 }
}
class Abstraction
{
 public static void main(String args[])
 {
  Pig p=new Pig();
  p.animalSound();
  p.sleep();
 }
}