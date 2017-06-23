import java.util.*;
public class FindUnique {
	public static void main(String[] args)
	{
		int array_size,flag=0;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		
			int i,count=1;
			for( i=0; i<array_size;i++ )
			{
				for(int j=0; j<array_size;j++)
				{
					if(int_array[i]==int_array[j] && i!=j)
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(" " + int_array[i]);
					break;
				}
				else if(count>2)
				{
					System.out.println(" Error " );
					break;
				}
				count=1;
			}
	}
}
