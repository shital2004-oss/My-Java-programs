class Narrowing
{
	public static void main(String[] args) 
	{
	 //byte<short<int<long<float<double

	 
	 float f= 246.01f;
	 System.out.println(f);
	 
	  double d=(double)f;
	 System.out.println(d);
	 
	 long l=(long)f;
	 System.out.println(l);//CTE
	 
	 byte b=(byte)f;
	 System.out.println(b); //CTE
		 
	 char c=(char)f;
	 System.out.println(c); //CTE
	 
	 int i=(int)f;
	 System.out.println(i);//CTE
	 
	 short s=(short)f;
	 System.out.println(s);//CTE
	 
	 
	 
	}
}
