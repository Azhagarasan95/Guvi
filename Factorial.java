import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int res=1,i;
    if(n < 0)
    {
        n=n*-1;
        for(i=1;i<=n;i++)
        {
            res*=i;
        }
        res=res*-1;
        System.out.println(res);
    }
    else if(n > 0)
    {
        for(i=1;i<=n;i++)
        {
            res*=i;
        }
        System.out.println(res);
    }
    else if(n == 0)
        System.out.println(res);
    input.close();
    }
}
