class Increment 
{
	public static void main(String[] args) 
	{
		int poc=100;//101//102//103//104//105//106//107
		
		System.out.println(poc++); //100
		System.out.println(++poc);//102
		System.out.println(poc++ + ++poc);//206
		System.out.println(++poc+ poc++);//210
		System.out.println(poc);//106
		System.out.println(poc++);//106
		
	
	}
}