import java.util.Scanner;
public class IsAlphabet
{
 public static void main(String[] args)
 {
  String str;
  char value;
  System.out.println("Enter the Character :");
  Scanner s = new Scanner(System.in);
  str = s.next();
  if(str.length()==1)
  {
   value = str.charAt(0);
   if(Character.isLetter(value))
   {
    System.out.println(value + " is a character");
   }
   else
   {
    System.out.println(value + " is not a character");
   }
  }
  else
  {
   System.out.println("Please enter a individul character");
  }
 }
}
