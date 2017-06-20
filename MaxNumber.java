import java.util.Scanner;
public class MaxNumber
{
 public static void main(String[] args)
 {
  int value1,value2,value3,max;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the value1 :");
  value1 = s.nextInt();
  System.out.println("Enter the value2 :");
  value2 = s.nextInt();
  System.out.println("Enter the value3 :");
  value3 = s.nextInt();
  max = value1;
  if(max < value2)
  {
   if(value2 < value3)
   {
    max = value3;
   }
   else
   {
    max = value2;
   }
  }
  else
  {
   if(max < value3)
   {
     max = value3;
   }
  }
   System.out.println("Maximum Number is : " + max);
 }
}
