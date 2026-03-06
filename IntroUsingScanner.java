import java.util.Scanner;

class IntroUsingScanner
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter your name:");
		String s1 =sc.next();
		
		System.out.println("Enter your salary:");
		float f1=sc.nextFloat();
		
		System.out.println("Enter your Date of Birth:");
		int i1=sc.nextInt();
             
		System.out.println("Enter your CGPA:");
		float f3=sc.nextFloat();
		
		System.out.println("Enter your MobileNo:");
		long l= sc.nextLong();
		
		System.out.println("Enter your Gender:");
		//char c= sc.next().CharAt();//CTE
		String s4= sc.next();
		
		System.out.println("Enter your fev number:");
		byte b= sc.nextByte();
		
		
	}
	
	}