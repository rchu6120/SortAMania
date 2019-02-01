public class Sorting_Algorithims
{
    public static void merge(int[] arr, int from, int mid, int to, int[] temp)
    {
        int x = from;
        int y = mid+1;
        int z = from;

        while(x<= mid && y <= to)
        {
            if(arr[x]<arr[y])
            {
                temp[z] = arr[x];
                x++;
            }
            else
            {
                temp[z] = arr[y];
                y++;
            }
            z++;
        }

        while (x <= mid)
        {
            temp[z] = arr[x];
            z++;
            x++;
        }
        while (y<= to)
        {
            temp[z] = arr[y];
            z++;
            y++;
        }
    }
    private static void mergeSortHelper(int[] arr, int from, int to, int[] temp)
    {
        if(from<to)
        {
            int middle = (from + to)/2;
            mergeSortHelper(arr,from,m)
        }
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
