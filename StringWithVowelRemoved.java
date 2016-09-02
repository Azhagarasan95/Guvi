import java.util.Scanner;
public class StringWithVowelRemoved {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str,str1;
		str=input.nextLine();
		str1=str.replaceAll("[aeiouAEIOU]", "");
		StringBuffer s=new StringBuffer(str1);
		System.out.println(s.reverse());
		input.close();
	}
}
