package polygone;

import java.util.Scanner;

public class Polygon {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter sides");
		int sides=scan.nextInt();
		PolygonApp pa=new PolygonApp();
		 pa.identifyPolygon(sides);
		
	
}
}
