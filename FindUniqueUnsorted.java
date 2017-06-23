Skip to content


This repository
 
Pull requests 
Issues 
Marketplace 
Gist



Sign out 


 Watch 
0 
 Star 
0 
 Fork 
0 

DurgaDevi317/Durga-JavaCode 
 Code 
 Issues 0 
 Pull requests 0 
 Projects 0 
 Wiki 
 Settings 
Insights  
Branch: master 
Find file 
Copy path
Durga-JavaCode/FindUnique.java 
dec33f9 2 minutes ago 
 DurgaDevi317 Update FindUnique.java 
1 contributor 
 
Raw
Blame
History
   
38 lines (36 sloc) 663 Bytes 

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
