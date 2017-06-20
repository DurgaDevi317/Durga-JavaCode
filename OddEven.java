import java.util.Scanner;
public class OddEven
{
 public static void main(String[] args)
 {
  int value;
  System.out.println("Enter the Number :");
  Scanner s = new Scanner(System.in);
  value = s.nextInt();
  if(value%2==0)
  {
   System.out.println("Even Number");
  }
  else
  {
   System.out.println("Odd Number");
  }
 }
}
