import java.util.*;
class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int N=input.nextInt();
        int sum=0;
        if(N>0)
            {
                for(int i=1;i<=N;i++)
                    sum+=0;
                System.out.print("The sum of " + N + " natural numbers is : " + sum);
            }
        else
            System.out.print("The number entered is not a natural number");
        input.close();
    }
}
