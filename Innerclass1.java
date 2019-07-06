class Outerclass
{
 int x=5;
 class Innerclass
 {
  int y=5;
 }
}
public class Innerclass1
{
 public static void main(String args[])
 {
  Outerclass o=new Outerclass();
  Outerclass.Innerclass i=o.new Innerclass();
  System.out.println(o.x+i.y);
 }
}