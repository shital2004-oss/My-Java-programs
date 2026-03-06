class SumOfDigit
{
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			sum=sum+i;    //sum is 0 and then add i like 1 then sum become 1 and that loop continue...
		}
		
		System.out.println("sum of Digit is: " +sum);
	}
}
