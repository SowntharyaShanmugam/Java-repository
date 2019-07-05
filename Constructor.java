class Constructor
{
 int val1;
 int val2;
 Constructor()
 {
  val1=10;
  val2=20;
  System.out.println("Inside constructor");
 }
 void display()
 {
  System.out.println("Value 0f 1:"+val1);
  System.out.println("Value of 2:"+val2);
 } 
 public static void main(String args[])
 {
  Constructor c=new Constructor();
  c.display();
 }
}