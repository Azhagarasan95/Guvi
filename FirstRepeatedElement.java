import java.util.*;
class FirstRepeatedElement
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array and the elements separated by space");
        int size=input.nextInt();
        if(size>0)
        {
            int[] elements=new int[size];
            for(int i=0;i<size;i++)
                elements[i]=input.nextInt();
            for(int i=0;i<size-1;i++)
                for(int j=0;j<size;j++)
                    if(i!=j)
                        if(elements[i] == elements[j])
                            {
                                System.out.print("The first repeated element is " + elements[i];
                                break;
                            }
        }
        else
            System.out.print("Error");
        input.close();
    }
}
