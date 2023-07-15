import java.util.Scanner;
public class FinanceCalculator 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal");
		double principal =scan.nextDouble();

		System.out.println("enter time");
		double time =scan.nextDouble();

		System.out.println("enter rate");
		double rate=scan.nextDouble();

		
		FinanceCalculatorApp fc= new FinanceCalculatorApp();
		System.out.printf("%.2f",fc.calculateSimpleInterest(principal,rate,time));
	}
		

	

}
