import java.util.Scanner;
public class TimeConvertor {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter minutes");
	int minutes =scan.nextInt();
	TimeConvertorApp tc=new TimeConvertorApp();
	System.out.println(tc.convertToHours(minutes));
	}

}
