class Outerclass
{
 int x=10;
 class Innerclass
 {
  public int innerMethod()
  {
   return x;
  }
 }
}
public class Innerclass2
{
 public static void main(String args[])
 {
  Outerclass o=new Outerclass();
  Outerclass.Innerclass i=o.new Innerclass();
  System.out.println(i.innerMethod());
 }
}