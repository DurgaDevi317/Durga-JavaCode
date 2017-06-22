import java.util.Scanner;
public class ReverseDigits{
	public static void main(String[] args)
	{
		int num,reversenum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to compute factorial :");
		num = s.nextInt();
		while(num>0)
		{
			reversenum = (reversenum*10) + (num%10);
			num = num/10;
		}
		System.out.println("Reverse of a given number will be :" + reversenum);
	}
}
