import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String str=new String();
		str=input.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.print(sb.reverse());
		input.close();
	}

}
