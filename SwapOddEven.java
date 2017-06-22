import java.util.*;

public class SwapOddEven {
	public static void main(String[] args)
	{
		String str;
		Scanner s = new Scanner(System.in);
		str = s.next();
		char[] char_array = new char[str.length()];
		char_array = str.toCharArray();
		if(str.length()%2==0)
		{
			for(int i=0; i<str.length(); i=i+2)
			{
				char temp = char_array[i];
				char_array[i] = char_array[i+1];
				char_array[i+1] = temp;
			}
		}
		else
		{
			for(int i=0; i<(str.length()-1); i=i+2)
			{
				char temp = char_array[i];
				char_array[i] = char_array[i+1];
				char_array[i+1] = temp;
			}
		}
		for(char c : char_array)
			System.out.print(c);
	}
}
