import java.util.Scanner;

public class StringToCamel {
	public static void main(String[] args)
	{
		int flag=0;
		String str;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		char[] char_array = new char[str.length()];
		char_array = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isLetter(char_array[i]) || Character.isDigit(char_array[i] || char_array[i]=='')
			{
 				if(char_array[i]==' ')
				{
					char_array[i+1] = Character.toUpperCase(char_array[i+1]);
					i++;
				}
				else
				{
					char_array[i] = Character.toLowerCase(char_array[i]);
				}
			}
			else
			{
				flag=1;
			}
		}
                if(flag==0)
		{
			for(char c : char_array)
				System.out.print(c);
		}
		else
		{
			System.out.println("Numbers are not allowed");
	        }
	}
}
