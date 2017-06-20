import java.util.Scanner;
public class NumDigits
{
 public static void main(String[] args)
 {
  int number,numdigits=0;
  System.out.println("Enter the number to compute number of digits :");
  Scanner s = new Scanner(System.in);
  number = s.nextInt();
  while(number>0)
  {
   number = number / 10;
   numdigits++;
  }
  System.out.println("Sum is : " + numdigits);
 }
}
