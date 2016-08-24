import java.util.*;
class LargestInThree
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if(a>b && a>c)
            System.out.print(a + " is Largest");
        else if(b>c)
            System.out.print(b + " is Largest");
        else
            System.out.print(c + " is Largest");
        input.close();
    }
}
