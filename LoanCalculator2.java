import java.util.Scanner;

class LoanCalculator2
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Amount:");
	   double amount=sc.nextDouble();
	   
	   for(; ;)
	   if(amount<1000 || amount>1000000)
		{
			System.out.println("Invalid Amount");
			continue;
		}
	   
	   System.out.println("Loan tenure in months");
	     int tenure=sc.nextInt();
	   
	   if(tenure<3 || tenure>36)
		{
			System.out.println("Invalid tenure");
			continue;
		}
	   
	   
	   System.out.println("interest");
	   int interest=sc.nextInt();
	   
	   if(interest<1 || interest>30)
		{
			System.out.println("Invalid interest:");
			continue;
		}
	   
	   double perMonthInt=(amount/100)*interest;
	   double totalIntAmt=perMonthInt*tenure;
	   double Emi=(amount+totalIntAmt)/tenure;
	   double totalamount=amount+totalIntAmt;
	   
	   System.out.println("\n Monthly EMI:");
	   System.out.println("\n Principal Amount:");
	   System.out.println("\n total interest:");
	   System.out.println("\n total amout:");
	   
	}
}