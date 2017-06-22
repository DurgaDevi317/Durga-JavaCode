import java.util.*;
public class StringReverse {
	public static void main(String[] args)
	{
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		str = s.next();
		StringBuffer strbuf = new StringBuffer(str);
		strbuf.reverse();
		System.out.println("Reversed string will be :" + strbuf);
	}
}
