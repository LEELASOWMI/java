import java.util.Scanner;
public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter num1");
		System.out.println("enter num2");
		long num1= scan.nextLong();
		long num2= scan.nextLong();
		GalacticArithmeticApp ga=new GalacticArithmeticApp();
		System.out.println(ga.galacticAddition(num1,num2));
		
	}

}
