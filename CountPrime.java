import java.util.*;
public class CountPrime {
	public static void main(String[] args)
	{
		int frange,erange,flag=0,count=0;
		Scanner s = new Scanner(System.in);
		frange = s.nextInt();
		erange = s.nextInt();
		for(int i=frange; i<=erange; i++)
		{
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count++;
			}
			flag=0;
		}
		System.out.println(count);
	}
}
