import java.util.*;
public class LeastAfterDelete {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        String num=input.next();
        int k=input.nextInt();
        int len=num.length();
        StringBuffer sb=new StringBuffer(num);
        char[] arr=num.toCharArray();
        for(int i=0;i<len-1;i++)
        	for(int j=i+1;j<len;j++)
        	{
        		if(((int) arr[i])<((int) arr[j]))
        		{
        			char temp;
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        StringBuilder sbd=new StringBuilder(num);
        for(int i=0;i<k;i++)
        {
        	sbd.deleteCharAt(sbd.toString().indexOf(arr[i]));
        }
        System.out.println(sbd.toString());
	}

}
