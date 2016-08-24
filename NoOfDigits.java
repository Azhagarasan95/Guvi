import java.util.*;
class NoOfDigits
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        System.out.print(count);
    }
}
