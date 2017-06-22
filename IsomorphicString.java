import java.util.*;
public class IsomorphicString {
	public static void main(String[] args)
	{
		int flag=0;
		String str1,str2;
		Scanner s = new Scanner(System.in);
		str1 = s.next();
		str2 = s.next();
		if(str1.length() == str2.length())
		{
			int len = str1.length();
			int vlen = 1;
			char[] char_array1 = new char[len];
			char[] char_array2 = new char[len];
			char[] visited = new char[len];
			char[] match = new char[len];
			visited[0] = char_array1[0];
			match[0] = char_array2[0];
			char_array1 = str1.toCharArray();
			char_array2 = str2.toCharArray();
			visited[0] = char_array1[0];
			match[0] = char_array2[0];
			for(int i=1; i<len; i++)
			{
				int j;
				for(j=0; j<vlen; j++)
				{
					if(char_array1[i]!=visited[j])
					{
						continue;
					}
					else
					{
						if(char_array2[i]!=match[j])
						{
							flag=1;
							break;
						}
					}
			     }
				if(j>=vlen)
				{
					visited[vlen] = char_array1[i];
					match[vlen] = char_array2[i];
					vlen++;
				}
				 if(flag==1)
				 {
					 break;
				 }
		     }
			 if(flag!=1)
			 {
				 System.out.println("Isomorphic");
			 }
			 else
			 {
				 System.out.println("Not an Isomorphic");
			 }
		}
	}
}
