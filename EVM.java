import java.util.Scanner;

class EVM
{
	static int bjp,aap,mns;
		
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the population of area:");
		 int pop=sc.nextInt();
		 
		 
		 for(int i=1 ;i<=pop ;i++)
		{
		
		System.out.println("***Welcome***");
		System.out.println("Apka ek vote Desh badal sakta hai!");
		System.out.println("\n 1.bjp \n 2.aap \n 3.mns ");
		System.out.println("Enter your Response");
		
		String resp=sc.next().toUpperCase();
			
		if(resp.equals("BJP"))
		{  
			bjp++;
			System.out.println("Acche Din ane wale hain");
		}
		else if(resp.equals("AAP"))
		{
			aap++;
			System.out.println("Aam adami Party");
		}
			else if(resp.equals("MNS"))
		{
		    mns++;
			System.out.println("Jai Maharastra");
		}
		else
		{
			System.out.println("Invalid Vote");
			i--;
			
			
		}
		System.out.println("BJP" +bjp);
		System.out.println("AAP" +aap);
		System.out.println("MNS" +mns);
	   
		if(bjp>=aap && bjp>=mns  )
			
			{
				System.out.println("Bjp won the Election by" +bjp+ "votes");
			}
			if(mns>=bjp&& mns>=aap)
			
			{
				System.out.println("mns won the Election by" +mns+ "votes");
			}
			if(aap>=bjp && aap>=mns )
			
			{
				System.out.println("aap won the Election by" +aap+ "votes");
			}
			
		}
	}
}