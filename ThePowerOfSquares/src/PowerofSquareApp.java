import java.util.Scanner;

public class PowerofSquareApp {

	public static void main(String[] args) 
		
		{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scan.nextInt();
		PowersOfSquares ps= new PowersOfSquares();
		System.out.println(ps. squareNumber(num));

	}

}
