class CompareThreeOperator 
{
	public static void main(String[] args) 
	{
		int  n1=10,n2=30,n3=90;
		//1)int large= n1>n2?n1:n2;
		// int largest= large>n3?large:n3;
		
		 // 2)int large= n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		
		// 3) int large=(n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
		// 4) int large;
		//int largest=n1>(large=n2>n3?n2:n3)?n1:large;
		
		// 5) int largest=n1>(n2>n3?n2:n3)?n1:(n2>n3?n2:n3);
				
	
		System.out.println(largest);
	}
}
