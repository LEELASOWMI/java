import java.util.Scanner;
public class DoubleTrouble {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);

		System.out.println("enter number:");
		
		int num= scan.nextInt();
		
		DoubleTroubleApp da=new DoubleTroubleApp();
		
		System.out.println(da.doubleTheNumber(num));
	}

}
