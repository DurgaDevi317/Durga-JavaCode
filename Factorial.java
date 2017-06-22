import java.util.*;
public class Factorial {
	public static void main(String[] args)
	{
		int num,factorial=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to compute factorial :");
		num = s.nextInt();
		for(int i=2; i<=num; i++)
		{
			factorial *= i;
		}
		System.out.println("Factorial of a given number will be :" + factorial);
	}
}
