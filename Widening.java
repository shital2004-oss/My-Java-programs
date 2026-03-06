class Widening 
{
	public static void main(String[] args) 
	{
		//byte<short<int<long<float<double
		
		byte s1=20;  
		short m1=s1;
		
		System.out.println(m1); //20
		
		short b1=10;
		int i1=b1;
		
		System.out.println(i1); //10
		
		char i2='a';
		int ch =i2;
		
		System.out.println(ch); //97
		  
	    int i5=98764;
		long l1=i5;
		
		System.out.println(l1); //98764
		
		long l2=23456l;
		float f1=l2;
		
		System.out.println(f1); //234561.0
		
		float f2=34.89f;
		double d=f2;
		
		System.out.println(f2); //34.8897966
		
		
		
	}
}
