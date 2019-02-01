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
}
