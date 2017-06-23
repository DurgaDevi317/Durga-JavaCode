import java.util.*;
public class FindRepeatInteger {
	public static void main(String[] args){
		int array_size,flag=0;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		int flag_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		for(int i=0; i<array_size; i++)
		{
			for(int j=i+1; j<array_size; j++)
			{
				if(int_array[i]==int_array[j] && flag_array[j]!=-1)
				{
					flag_array[j]=-1;
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(int_array[i] + " ");
			}
			flag=0;
		}
	}
}
