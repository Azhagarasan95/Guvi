import java.util.*;
class SumToTarget
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array, array elements and target value");
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        int target=input.nextInt();
        input.close();
        for(int i=0;i<size-1;i++)
            for(int j=i+1;j<size;j++)
                if((arr[i] + arr[j]) == target)
                {
                    System.out.print(arr[i] + " and " + arr[j] + " are the elements);
                    System.exit();
                }
        System.out.print("No such elements exists");
    }
}
