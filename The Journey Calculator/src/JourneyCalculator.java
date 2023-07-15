import java.util.Scanner;
public class JourneyCalculator {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double speed =scan.nextDouble();
		double time =scan.nextDouble();
		JourneyClculatorApp ja= new JourneyClculatorApp();
		System.out.println(ja.calculateDistance(speed,time));

	}

}
