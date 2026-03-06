import java.util.Scanner;

class UniueNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		int count=0;
		
		while (temp>0)
		{ 
			int digit =temp%10;
			int check=temp/10;
			
			while(check>0)
			{
				if(digit==check%10)
				{
					count++;
				}
				check=check/10;
			}
			temp=temp/10;
		}
		if(count>0)
		{
			System.out.println("Not Unique Number");
		}
		else
		{
			System.out.println("Unique Number:");
		}
	}		
}