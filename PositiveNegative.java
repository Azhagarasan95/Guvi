import java.util.*;

class PositiveNegative {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num == 0)
			System.out.println("Zero");
		else if(num > 0)
			System.out.println("Positive");
		else if(num < 0)
			System.out.println("Negative");
	}
}
