import java.util.Scanner;
public class NonRepeatingInteger {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[] n=new int[num];
		for(int i=0;i<num;i++)
			n[i]=input.nextInt();
		for(int i=0;i<num;i++)
			for(int j=i+1;j<num;j++)
				if(n[i]==n[j])
				{
					n[i]=0;
					n[j]=0;
				}
		for(int i=0;i<num;i++)
			if(n[i]!=0)
				System.out.println(n[i]);
		input.close();
	}
}
