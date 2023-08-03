package polygone;
import java.util.Scanner;
public class PolygonApp {
	public static void identifyPolygon(int sides)
	{
		if(sides==0||sides==1||sides==2)
		
		{
			System.exit(0);
		}
	else if(sides==3)
		{
			System.out.println("Triangle");
		}
		else if(sides==4)
		{
			System.out.println("quarta");
		}
		else if(sides==5)
		{
			System.out.println("pentagonal");
		}
		else if (sides==6)
		{
			System.out.println("hexagonal");
		
		}
		else
		{
			System.out.println("its polygone");
		}
}
}