class ConstructorChaining
{
 int val1;
 int val2;
 ConstructorChaining()
 {
  val1=1;
  val2=2;
  System.out.println("Inside Parent constructor1");
 }
 ConstructorChaining(int a)
 {
  val1=a;
  System.out.println("Inside Parent constructor2");
 }
 public void display()
 {
  System.out.println("Value 0f 1:"+val1);
  System.out.println("Value of 2:"+val2);
 } 
 public static void main(String args[])
 {
  Child c=new Child();
  c.display();
 }
}
class Child extends ConstructorChaining
{
 int val3;
 int val4;
 Child()
 {
  val3=3;
  val4=4;
  System.out.println("Inside Child constructor");
 }
 public void display()
 {
  System.out.println("Value 0f 1:"+val1);
  System.out.println("Value of 2:"+val2);
  System.out.println("Value 0f 1:"+val3);
  System.out.println("Value of 2:"+val4);
 } 
}
