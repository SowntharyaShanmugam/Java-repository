class ConstructorOverloading
{
 int val1;
 int val2;
 ConstructorOverloading()
 {
  val1=10;
  val2=20;
  System.out.println("Inside constructor1");
 }
 ConstructorOverloading(int a)
 {
  val1=a;
  System.out.println("Inside constructor2");
 }
 ConstructorOverloading(int a,int b)
 {
  val1=a;
  val2=b;
  System.out.println("Inside constructor3");
 }
 public void display()
 {
  System.out.println("Value 0f 1:"+val1);
  System.out.println("Value of 2:"+val2);
 } 
 public static void main(String args[])
 {
  Constructor c1=new Constructor();
  Constructor c2=new Constructor(30);
  Constructor c3=new Constructor(40,50);
  c1.display();
  c2.display();
  c3.display();
 }
}