import java.util.Scanner;
class StonePaperScissor
{
	public static void main(String args[])
		
	{
		Scanner sc=new Scanner(System.in);
		infiniteloop:
			for(; ; )
		{
			System.out.println(\n"*** WELCOME ***"\n);
			//user implementation
			
			System.out.println("/n1.STONE \n2.PAPER \n3.SCESSIOR\n");
			System.out.println("User Enter the Response:");
			int dgtUser=sc.nextInt();
			
			String user="";
			
			if (dgtUser==1) user="STONE";
			else if (dgtUser==2) user="PAPER";
			else if (dgtUser==3) user="SCISSOR";
			else
			{
			 System.out.println("*INVALID RESPONSE*");	
			 continue infiniteloop;
			}
			//bot implementation
			int dgtBot=0;
			for( ; ; )
			{
				dgtBot=(int)(Math.random()*10);
				
				if(dgtBot>=1 && dgtBot<=3)
					break;
			}
		
		String bot="";
		if(dgtBot==1) bot="STONE";
		else if(dgtBot==2) bot="PAPER";
		else bot="SCISSOR";
		
		System.out.printf("%n%10s %8s","BOT","USER");
		System.out.printf("%n%10s %8s",bot,user);
		
		
		//calculate winner
		if(bot.euals("STONE") &&user.equals("PAPER") || 
			(bot.euals("PAPER") &&user.equals("SCISSOR") || 
			(bot.euals("SCISSOR") &&user.equals("STONE")))
			
		}
		
	}
}