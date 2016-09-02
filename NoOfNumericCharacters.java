import java.util.Scanner;
public class NoOfNumericCharacters {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char token[]=str.toCharArray();
		for(char s:token)
			if((Integer.valueOf(s) >= Integer.valueOf('0')) && (Integer.valueOf(s) <= Integer.valueOf('9')))
				System.out.print(s);
		input.close();
	}
}
