import java.util.Scanner;
public class MinSumArray {
	public static void main(String[] args)
	{
		int len=0,array_size,flag=0;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		int f_array[] = new int[array_size];
		int s_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array_size;i++)
		{
			for(int j=i;j<array_size;j++)
			{
				int val = (int_array[i]+int_array[j]);
				if(Math.abs(min-0)>Math.abs(val-0))
				{
					min = val;
					len =0;
					f_array[len]=int_array[i];
					s_array[len]=int_array[j];
					len++;
				}
				else if(Math.abs(min-0)==Math.abs(val-0))
				{
					f_array[len]=int_array[i];
					s_array[len]=int_array[j];
					len++;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.format("%d %d\n",f_array[i],s_array[i]);
		}
	}
}
