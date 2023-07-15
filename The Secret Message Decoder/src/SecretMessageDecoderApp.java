import java.util.Scanner;
public class SecretMessageDecoderApp {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	char ch =scan.next().charAt(0);
	SecretMessageDecoder md=new SecretMessageDecoder();
	System.out.println(md.decodeCharacter(ch));
	}

}
