import java.util.Scanner;

public class ArrayType {
    static int[] array;
    static int arraySize;
    public static int findArrayType()
    {
        int evenCount=0,oddCount=0;
        for(int i=0;i<arraySize;i++)
        {
            if(array[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        if(evenCount==arraySize)
            return 1;
        else if(oddCount==arraySize)
            return 2;
        else
            return 3;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        arraySize=sc.nextInt();
        int arrayType;
        array=new int[arraySize];
        for(int i=0;i<arraySize;i++)
            array[i]=sc.nextInt();
        arrayType=findArrayType();
        if(arrayType==1)
            System.out.println("The array is Even");
        else if(arrayType==2)
            System.out.println("The array is Odd");
        else
            System.out.println("The array is Mixed");

    }
}
