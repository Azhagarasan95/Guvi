import java.util.*;
public class Seed {
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int seed=input.nextInt();
		int res=num;
		while(num>0)
		{
			res*=num%10;
			num/=10;
		}
		if(res==seed)
			System.out.print("seed");
		else
			System.out.println("not a seed");
	}

}
