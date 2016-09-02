import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		int num=Integer.parseInt(str1)*Integer.parseInt(str2);
		System.out.println(String.valueOf(num));
		input.close();
	}

}
