class SumOfDigitEvenOdd
{
	public static void main(String args[])
	{
		int i=0;
		int evenSum=0;
		int OddSum=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			if (i%2==0)
			{
				evenSum += i;
				
			}
			else
			{
				OddSum += i;
				
			}
			System.out.println("EvenSum of Digit is: " +evenSum);  
			System.out.println("OddSum of Digit is: " +OddSum);
		}
		
	}
}
