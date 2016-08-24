import java.util.*;
class ReverseOrderOfWords
{
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] words=line.split(" ");
        int len=words.length;
        while(len>0)
        {
            System.out.print(words[len] + " ");
            len--;
        }
        System.out.print(words[len]);
        input.close();
    }
}
