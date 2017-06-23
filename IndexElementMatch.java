import java.util.*;
public class IndexElementMatch {
	public static void main(String[] args){
		int array_size,flag=0;
		Scanner s = new Scanner(System.in);
		array_size = s.nextInt();
		int int_array[] = new int[array_size];
		for(int i=0; i<array_size; i++)
		{
			int_array[i] = s.nextInt();
		}
		Arrays.sort(int_array);
		for(int i=0; i<array_size; i++)
		{
			if(int_array[i] == i)
			{
				System.out.print(" " + i);
			}
		}
	}
}
