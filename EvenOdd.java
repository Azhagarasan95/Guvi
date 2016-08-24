import java.util.*;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%2==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
        input.close();
    }
}
