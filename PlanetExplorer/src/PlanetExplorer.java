import java.util.Scanner;
public class PlanetExplorer
{
	public static void main(String []args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the radious to calcilate the Area");
		Double radius = scan.nextDouble();
		PlanetExplorerApp pe= new PlanetExplorerApp();
		System.out.println(pe.calculateSurfaceArea(radius));
	}
}
