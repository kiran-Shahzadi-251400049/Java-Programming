public class SwapArray
{
    public static void main(String [] args)
    {
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("\nArray before swapping: ");
        printArray(array);
        int arr[]= arraySwapValues(array);
        System.out.println("\n\nArray after swapping: ");
        printArray(arr);
    }//main

    public static int[] arraySwapValues(int[] array)
    {
        int temTemp=array[0];
        for(int i=0; i<array.length-1; i++)
        {
            array[i]=array[i+1];
        }
        array[array.length-1]=temTemp;
        return array;
    }//arraySwapValues

    public static void printArray(int[]array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }

    }//printArray
}//class