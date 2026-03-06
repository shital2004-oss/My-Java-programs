class CountofDigitEvenOdd
{
	public static void main(String args[])
	{
		int i=1;
		int Evencount=0;
		int Oddcount=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			
			if (i%2==0)
			{
				Evencount++;
			}
			else{
				Oddcount++;
			}
		
		}
		
		System.out.println("Evencount of Digit is: " +Evencount);
		System.out.println("OddCount os digit is: " +Oddcount);
	}
}
