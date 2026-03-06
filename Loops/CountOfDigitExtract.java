class CountOfDigitExtract
{
	public static void main (String args[])
	{
		int num=1234;
		int EvenCount=0;
		int OddCount=0;
		
		while (num!=0)
		{
			int last=num%10;
			System.out.println(last);
			num=num/10;
			//num++;
			
			if (last%2==0)
			{
				EvenCount++;
					
			}
			else
			{
				OddCount++;
			}
			System.out.println("Even Sum is: " +EvenCount);
			System.out.println("Odd sum is: " +OddCount);
		}
	}
}