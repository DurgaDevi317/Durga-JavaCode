import java.util.*;
public class StringToInt {
	public static void main(String[] args)
	{
		int a;
		String str;
		Scanner s = new Scanner(System.in);
		str = s.next();
		char[] char_array = str.toCharArray();
		System.out.println("Character : Value");
		for(int i=0;i<str.length(); i++)
		{
			 a= char_array[i];
			 System.out.format("   %c      :  %d \n",a,a);
		}
	}
}
