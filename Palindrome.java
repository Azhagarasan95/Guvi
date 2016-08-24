import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in)
        String str=input.next();
        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        if(sb.toString().equals(str))
            System.out.print(str + " is a Palindrome");
        else
            System.out.print(str + " is not a Palindrome");
        input.close();
    }
}
