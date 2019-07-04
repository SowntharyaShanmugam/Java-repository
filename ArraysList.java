import java.util.ArrayList;
class ArraysList
{
 public static void main(String args[])
 {
  ArrayList test=new ArrayList();
  System.out.println("Size of arraylist at creation"+test.size());
  test.add("D");
  test.add("U");
  test.add("K");
  test.add("E");
  System.out.println("Size of arraylist after adding elements"+test.size());
  System.out.println("List of all elements"+test);
  test.remove("D");
  System.out.println("Content after removing one element"+test);
  test.remove(2);
  System.out.println("Content after removing element by index"+test);
  System.out.println("Size of arraylist after removing elements"+test.size());
  System.out.println("List of all elements after removing elements"+test);
  System.out.println(test.contains("K"));
 }
}