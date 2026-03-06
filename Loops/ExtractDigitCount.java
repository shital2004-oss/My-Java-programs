import java.util.Scanner;

class ExtractDigitCount
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number: ");
	  int num=sc.nextInt();
	  int sum=0;
	  
	  while (num!=0)
	  {
		  int digit=num%10;
		  sum+=digit;
		  System.out.println(digit);
		  num=num/10;
		 
	  }
	  System.out.println("sum of digit is:" +sum);
	}
}