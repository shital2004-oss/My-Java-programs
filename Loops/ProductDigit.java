class ProductDigit
{
	public static void main (String args[])
	{
		int num=1234;
		int product=1;
		int sum=0;
		
		while (num!=0)
		{
			int last=num%10;
			System.out.println(last);
			num=num/10;
			sum+=sum+last;
		
			
			//num++;
		}
		System.out.println("Product of Sum is: " +product);
           }
}