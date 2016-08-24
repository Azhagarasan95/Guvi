import java.util.*;
class IntegerEqualsIndex
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int size=input.nextInt();
        System.out.print("Enter " + size + " elements ");
        int[] elements=new int[size];
        for(int i=0;i<size;i++)
            elements[i]=input.nextInt();
        for(int i=0;i<size;i++)
            if(elements[i] == i)
                System.out.print(i + " ");
        input.close();
    }
}
