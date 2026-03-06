import java.util.Scanner;
class DoWhileEx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int number;
		do
		{
			System.out.println("Enter number (0 to Nostop)");  
			number=sc.nextInt();
		}
		while (number==0);
		 
		System.out.println("Program Ended!");
	}
}