public class Sorting_Algorithims
{
    public static void merge(int[] arr, int from, int mid,int[] temp)
    {

    }

    public static void intSwap(int[] arr, int i, int j)
    {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;

    }

    public static void insertionSort(int[] arr)
    {
        for(int curCheck = 0; curCheck <arr.length-1;curCheck++)
        {
            if(arr[curCheck]>arr[curCheck+1])
            {
                for(int i =curCheck; i>=0;i--)
                {
                    if (arr[i] > arr[i+1])
                    { intSwap(arr,i,i+1);}
                }
            }
        }
    }
}
