import java.util.Scanner;
public class HeightConvertor {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the inches");
		double inches = scan.nextDouble();
		HeightConvertorApp hc=new HeightConvertorApp();
		System.out.println(hc.convertInchesToFeet (inches));
	

	}

}
