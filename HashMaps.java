import java.util.HashMap;
public class HashMaps
{
 public static void main(String args[])
 {
  HashMap<String, Integer> people=new HashMap<String, Integer>();
  people.put("Sowntharya",22);
  people.put("Bubbly",25);
  people.put("Baby",22);
  for(String i:
  people.keySet())
  {
   System.out.println("Name"+i+"Age"+people.get(i));
  }
 }
}