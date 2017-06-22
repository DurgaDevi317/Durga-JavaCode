import java.util.*;
public class RomanToInt {
	public static void main(String[] args)
	{
		int num=0,flag=0;
		String romannum;
		System.out.println("Enter the roamn number :");
		Scanner s = new Scanner(System.in);
		romannum = s.next();
		char[] char_array = new char[romannum.length()];
		char_array = romannum.toCharArray();
		int[] int_array = new int[romannum.length()];
		for(int i=0;i<romannum.length(); i++)
		{
			if(char_array[i]=='I' || char_array[i]=='i')
			{
				int_array[i]=1;
			}
			else if(char_array[i]=='V' || char_array[i]=='v')
			{
				int_array[i]=5;
			}
			else if(char_array[i]=='X' || char_array[i]=='x')
			{
				int_array[i]=10;
			}
			else if(char_array[i]=='L' || char_array[i]=='l')
			{
				int_array[i]=50;
			}
			else if(char_array[i]=='C' || char_array[i]=='c')
			{
				int_array[i]=100;
			}
			else if(char_array[i]=='D' || char_array[i]=='d')
			{
				int_array[i]=500;
			}
			else if(char_array[i]=='M' || char_array[i]=='m')
			{
				int_array[i]=1000;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==0)
		{
		for(int i=0;i<(int_array.length-1);i++)
		{
			for(int j=i; j<int_array.length; j++)
			{
				if(int_array[i]<int_array[j])
				{
					int_array[i] = 0 - int_array[i];
					break;
				}
			}
		}
		for(int i=0; i<int_array.length; i++)
		{
			num += int_array[i];
		}
		System.out.println("Actual Value is :" + num);
		}
		else
		{
			System.out.println("Not a Roman Number");
		}
	}
}
