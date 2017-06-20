import java.util.Scanner;
public class IsLeapYear
{
 public static void main(String[] args)
 {
  int year;
  System.out.println("Enter the year need to check :");
  Scanner s = new Scanner(System.in);
  year = s.nextInt();
  if(( year%4==0 && year%100!=0 ) || year%400==0)
  {
   System.out.println(year + " is Leap year");
  }
  else
  {
   System.out.println(year + " is not Leap year");
  }
 }
}
