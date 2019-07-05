interface FirstInterface
{
 public void method1();
}
interface SecondInterface
{
 public void method2();
}
class Interface implements FirstInterface,SecondInterface
{
 public void method1()
 {
  System.out.println("Sowntharya");
 }
 public void method2()
 {
  System.out.println("Software engineer");
 }
}
class MultipleInterface
{
 public static void main(String args[])
 {
  Interface i=new Interface();
  i.method1();
  i.method2();
 }
}