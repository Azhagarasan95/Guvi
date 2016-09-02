import java.util.Scanner;
public class NoOfCharactersInSentence {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		if(str.isEmpty())
        	System.out.println("null value");
        else
        {
        	System.out.println(str.length());
        }
	}
}
