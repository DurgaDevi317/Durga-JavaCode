import java.util.*;
public class SubSetArray {
	public static void main(String[] args)
	{
		int i,len=0,f_array_size,s_array_size;
		Scanner s = new Scanner(System.in);
		f_array_size = s.nextInt();
		s_array_size = s.nextInt();
		if(f_array_size<=s_array_size)
		{
			int f_array[] = new int[f_array_size];
			int s_array[] = new int[s_array_size];
			for(i=0; i<f_array_size; i++)
			{
				f_array[i] = s.nextInt();
			}
			for(i=0; i<s_array_size; i++)
			{
				s_array[i] = s.nextInt();
			}
			for(i=0; i<f_array_size; i++)
			{
				int j;
				for(j=0; j<s_array_size; j++)
				{
					if(f_array[i]==s_array[j])
					{
						break;
					}
				}
				if(j>=s_array_size)
				{
					break;
				}
			}
			if(i>=f_array_size)
			{
				System.out.println("First array is a subset of second one");
			}
			else
			{
				System.out.println("First array is not a subset of second one");
			}
		}
		else
		{
			System.out.println("First array should have less or equal elements than the second array");
		}
	}
}
