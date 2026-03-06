import java.util.Scanner;

class PowerNumber
{
public static vid main (String args[]);
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		double num=sc.nextDouble();
		System.out.println("Enter a power");
		double power=sc.nextDouble();
		
		if (num<0)
		{
			power=power*-1;
			num=1/num;
		}
		double op=1;
		for (int i=0; i<=power ;i++ )
		{
			op=op*num;
			
			System.out.println("user defined:"+op);
			System.out.println("Built-in:"+Math.pow(num,power));
		}
	}
}