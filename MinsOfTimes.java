import java.util.*;
public class MinsOfTimes {
	public static void main(String[] args)
	{
		String ftime,etime;
		Scanner s = new Scanner(System.in);
		System.out.println("Time format should be hh:mm:ss:pm/am");
		ftime = s.next();
		etime = s.next();
		StringTokenizer strtoken1 = new StringTokenizer(ftime,":");
		StringTokenizer strtoken2 = new StringTokenizer(etime,":");
		if(strtoken1.countTokens()==4 && strtoken2.countTokens()==4)
		{
			int fhour = Integer.parseInt(strtoken1.nextToken());
			int fmin = Integer.parseInt(strtoken1.nextToken());
			int fsec = Integer.parseInt(strtoken1.nextToken());
			String fmode = strtoken1.nextToken();
			int ehour = Integer.parseInt(strtoken2.nextToken());
			int emin = Integer.parseInt(strtoken2.nextToken());
			int esec = Integer.parseInt(strtoken2.nextToken());
			String emode = strtoken2.nextToken();
			int hour = ehour - fhour;
			int min = emin - fmin;
			if(fmode.equals(emode))
			{
				if(min<0)
					min = 0 - min;
				min = (hour * 60) - min;
			}
			else
			{
				hour =hour  + 12;
				min =  min + (hour * 60);				
			}
			System.out.println(min);
		}
		else
		{
			System.out.println("Time should be in specified format");
		}
	}
}
