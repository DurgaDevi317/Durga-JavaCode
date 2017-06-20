import java.util.Scanner;
public class IsVowel
{
 public static void main(String[] args)
 {
  char value;
  String str;
  System.out.println("Enter the Character :");
  Scanner s = new Scanner(System.in);
  str = s.next();
  if(str.length()==1)
  {
   value = str.charAt(0);
   if(!Character.isDigit(value))
   {
    if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u'||value=='A'||value=='E'||value=='I'||value=='O'||value=='U')
    {
     System.out.println(value + " is vowel");
    }
    else
    {
     System.out.println(value + " is consonant");
    }
   }
   else
   {
    System.out.println(value + " is not an alphabet");
   }
  }
  else
  {
   System.out.println("Please enter a individul character");
  }
 }
}
