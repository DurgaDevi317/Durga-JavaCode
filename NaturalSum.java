import java.util.Scanner;
public class NaturalSumLoop
{
 public static void main(String[] args)
 {
  int number,sum=0;
  System.out.println("Enter the number to compute sum :");
  Scanner s = new Scanner(System.in);
  number = s.nextInt();
  if(number>0)
  {
   sum = number * (number+1) / 2;
   System.out.println("Sum is : " + sum);
  }
  else
  {
   System.out.println("please enter a positive number");
  }
 }
}
