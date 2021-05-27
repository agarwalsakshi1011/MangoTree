import java.util.Scanner;

public class ArrayRange {
    static int[] array;
    static int arraySize;
    public static int findArrayRange()
    {
        int maxElement=Integer.MIN_VALUE,minElement=Integer.MAX_VALUE;
        for(int i=0;i<arraySize;i++)
        {
            if(array[i]>maxElement)
                maxElement=array[i];
            if(array[i]<minElement)
                minElement=array[i];
        }
        return maxElement-minElement;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        arraySize=sc.nextInt();
        array=new int[arraySize];
        for(int i=0;i<arraySize;i++)
            array[i]=sc.nextInt();
        System.out.println("The range of the array is "+findArrayRange());


    }
}
