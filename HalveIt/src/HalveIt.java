import java.util.Scanner;
public class HalveIt {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		double num=scan.nextDouble();
		HlaveItApp hi=new HlaveItApp();
		System.out.printf("%.2f",hi.halveTheNumber(num));
	}
	

}
