package Transport;
import java.util.Scanner;

public class Transport5 {
	public static void main(String []args)
	{
		
		
		
				Scanner scan=new Scanner(System.in);
				double s=scan.nextDouble();
				double t=scan.nextDouble();
				
				Dist d1=new Dist();
				double res =d1.distance1(s,t);
				System.out.printf("%.2f\n",res);				
			}
		}

			class Dist{
			public double distance1(double s,double t){
				
				return s*t;
				
			}

		}
