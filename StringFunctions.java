public class StringFunctions
{
 public static void main(String args[])
 {
  String str1="Rock";
  String str2="Star";
  String str3=str1+str2;
  //Concatenation of string
  System.out.println(str3);
  //To find length of string
  System.out.println("Length of string:"+str1.length());
  //IndexOf method
  System.out.println("Index of character 'C':"+str1.indexOf('C'));
  //charAt method
  System.out.println("Character at position 2:"+str1.charAt(2));
  //CompareTo method
  System.out.println("Compare to 'Rock':"+str1.compareTo("rock"));
  //Contain method
  System.out.println("Contains sequence 'ck':"+str1.contains("ck"));
  //Endswith method
  System.out.println("Ends with character 'k':"+str1.endsWith("k"));
  //Replace method
  System.out.println("Replace 'Rock' with 'Duke':"+str1.replace("Rock","Duke"));
  //Covert to lowercase
  System.out.println("Covert to lowercase:"+str1.toLowerCase());
  //Convert to uppercase
  System.out.println("Convert to uppercase:"+str2.toUpperCase());
 }
}