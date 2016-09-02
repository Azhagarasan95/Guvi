import java.util.Scanner;
public class NumberOfAscii {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			int count=0;
			char token[]=str.toCharArray();
			for(char s:token)
				if((Integer.valueOf(s) >= Integer.valueOf('!')) && (Integer.valueOf(s) <= Integer.valueOf('/')))
					count++;
			System.out.print(count);
			input.close();
		}
	}
