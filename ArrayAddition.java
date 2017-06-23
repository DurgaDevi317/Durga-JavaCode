import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args)
	{
		int array_size;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		System.out.println(   "i"    +    "j"    +    "k");
		for(int i=0; i<array_size; i++)
		{
			for(int j=i; j<array_size; j++)
			{
				int sum =(int_array[i] + int_array[j]);
				for(int k=0; k<array_size; k++)
				{
					if(sum == int_array[k] )
					{
						System.out.format("%d%d%d\n",i,j,k);
					}
				}
			}
		}
	}
}
