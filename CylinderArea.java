import java.util.Scanner;
class CylinderArea
{
	
	public static void main(String args[])
		
	{
		Scanner sc= new Scanner(System.in);
		
	      System.out.println("Enter the radius of a Cylinder (cm) :");
		  double radius=sc.nextDouble();
		  
		  final float PI=3.14f;
		  final double area= PI*(radius*radius);
		  
		  System.out.println("enter the height :");
		  double height=sc.nextDouble();
		  
		  final double volume= area*height;
		  
		  System.out.println("the area is :" +area);
		  System.out.println("the volume is :" +volume);
		  
		  
		  }
}