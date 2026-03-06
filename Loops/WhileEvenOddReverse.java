class WhileEvenOddReverse
{
	public static void main(String args[])
	{
		int i=1; //Starting
		
		while(i<=100)  //upto 100 limit
		{
			//if i declare i++ here then first increment my ele so it will start drom 2 not 1 therefore i have write it at last
			
			if (i%2==0)
			{
				System.out.println(i+ " is even num:" );
			}
			
			else
			{
				 System.out.println(i+ " is odd num:");
			}
			i++;
		}
	}
}