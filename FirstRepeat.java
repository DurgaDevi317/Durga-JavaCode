import java.util.Arrays;
import java.util.Scanner;
public class FirstRepeat {
	public static void main(String[] args)
	{
		int array_size;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		int visit_array[] = new int[array_size];
		int count_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		int i,len=0;
		for( i=0; i<array_size;i++ )
		{
			int j;
			for(j=0; j<len;j++)
			{
				if(int_array[i]==visit_array[j])
				{
					count_array[j]++;
				}
				if(count_array[j]==2)
				{
					System.out.println(int_array[i]);
					break;
				}
			}
			if(j<len)
			{
				break;
			}
			else
			{
				visit_array[j] = int_array[i];
				count_array[j] = 1;
				len++;
			}
		}
	}
}
