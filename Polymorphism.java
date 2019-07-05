class Animal
{
 public void animalSound()
 {
  System.out.println("Animal sounds");
 }
}
class Pig extends Animal
{
 public void animalSound()
 {
  System.out.println("The pig sounds wee wee");
 }
}
class Dog extends Animal
{
 public void animalSound()
 {
  System.out.println("The dog sounds bow bow");
 }
}
public class Polymorphism
{
 public static void main(String args[])
 {
  Animal a=new Animal();
  a.animalSound();
  Animal p=new Pig();
  p.animalSound();
  Animal d=new Dog();
  d.animalSound();
 }
}