import java.util.Scanner;

class LeapYearCountReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Starting number:");
		int start=sc.nextInt();
		
	    System.out.println("Enter the ending number:");
		int end=sc.nextInt();
		
		int count=0;
		
		while (end>=start)
		{
			if ( (end%4==0 && end%100!=0) || end%400==0)
			{
				System.out.println("Leap year: " +end);
				count++;
			}
			 end--;
		}
	    System.out.println("-----------------------------");
		System.out.println("total number of count is: " +count);
	}
	
}