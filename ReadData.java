import java.util.Scanner; 
class ReadData 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number:");
		 int n1=sc.nextInt();
		
		System.out.println("enter second number:");
		int n2=sc.nextInt();
		
		int ans = n1+n2;
		System.out.println("Addition of "+n1+ "and" +n2+ "Is:" +ans);
	}
}
