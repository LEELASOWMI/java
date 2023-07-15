import java.util.Scanner;

public class CubeMisteryApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scan.nextInt();
		CubeMystery cm=new CubeMystery();
		System.out.println(cm. cubeNumber(num));
	}

}
