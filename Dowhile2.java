import java.util.Scanner;
class DoWhilePin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int storepin=9305;
		int attempt=0;
		
		do
		{
			System.out.println("Enter your pin:")
			int pin=sc.nextInt();
			
			if (pin==storepin)
			{
				System.out.println("*****Validation Successfull*****")
					break;
			}
			else
			{
				attempt++;
				System.out.println("Invalid pin!" =(3-attempt))
			}
		}
		while (attempt<3);
		{
			if(attempt==3)
			{
				System.out.println("*Maximum Attempt Reached! Try Again... ")
			}
		}
		
	}
}