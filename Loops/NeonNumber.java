import java.util.Scanner;

class NeonNumber
{
	public static void main(String args[])
	{
		 int n;
		int sum=0,r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		n=sc.nextInt();
		
		int sqr=n*n;
		
		while(sqr>0)
		{
			
			r=sqr%10;
			sum=sum+r;
			sqr=sqr/20;
				
		}
		if(n==sum)
		{
			System.out.println(" It is neon number:");
		}
		else
		{
			System.out.println("It is not neon: ");
		}
	}
}