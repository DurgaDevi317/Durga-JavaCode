import java.util.Scanner;
public class FindNumber
{
 public static void main(String[] args)
 {
  int value;
  System.out.println("Enter the Number :");
  Scanner s = new Scanner(System.in);
  value = s.nextInt();
  if(value<0)
  {
   System.out.println("Negative Number");
  }
  else if(value>0)
  {
   System.out.println("Positive Number");
  }
  else
  {
   System.out.println("Zero");
  }
 }
}
