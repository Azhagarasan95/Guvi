import java.util.Scanner;
public class NoOfWords {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String token[]=str.split(" ");
		if(str.isEmpty())
        	System.out.println("null value");
        else
        	System.out.println(token.length);
	}
}
