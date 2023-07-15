import java.util.Scanner;
public class TemparatureConvertorApp {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		double fh=scan.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		System.out.printf("%.2f",tc.convertFahrenheitToCelsius(fh));

	}

}
