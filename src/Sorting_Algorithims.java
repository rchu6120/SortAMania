public class Sorting_Algorithims {
    public static void merge(int[] arr, int from, int mid, int to, int[] temp) {
        int x = from;
        int y = mid + 1;
        int z = from;

        while (x <= mid && y <= to)
        {
            if (arr[x] < arr[y]) {
                temp[z] = arr[x];
                x++;
            } else {
                temp[z] = arr[y];
                y++;
            }
            z++;
        }

        while (x <= mid) {
            temp[z] = arr[x];
            z++;
            x++;
        }
        while (y <= to) {
            temp[z] = arr[y];
            z++;
            y++;
        }
    }
    private static void mergeSortHelper(int[] arr, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(arr, from, middle, temp);
            mergeSortHelper(arr, from, middle, temp);
            merge(arr, from, middle, to, temp);
        }
    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    public static void doubleMerge(int[][] arr2, int from, int mid, int to , int[][] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = to;
        int a = 0;
        while (i <= mid && j <= to)
        {
                if (arr2[i][a] == arr2[j][a])
                {
                    a++;
                }
                else
                {
                    if(arr2[i][a]<arr2[j][a])
                    {
                        temp[k] = arr2[i];
                        i++;
                        a=0;
                    }
                    else
                    {
                        temp[k] = arr2[j];
                        j++;
                        a=0;
                    }
                }
        }
        while(i<= mid)
        {
            temp[k] = arr2[i];
            k++;
            i++;
        }
        while(j<=to)
        {
            temp[k] = arr2[j];
            k++;
            j++;
        }
    }
    public static void doubleMergeSortHelper(int[][] arr2, int from, int to, int[][] temp)
    {
        if(from<to)
        {
            int middle = (from + to)/2;
            doubleMergeSortHelper(arr2,from,middle,temp);
            doubleMergeSortHelper(arr2,from,middle,temp);
            doubleMerge(arr2,from,middle,to,temp);
        }
    }
    public static void doubleMergeSort(int[][] arr2)
    {
        int n = arr2.length;
        int m = arr2[0].length;
        int [][] temp = new int[n][m];
        doubleMergeSortHelper(arr2,0,n-1,temp);
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

   /* public static void selectionSort(String[] arr)
    {
        int minPos=0;
        for(int curPos = 0;curPos<arr.length-1; curPos++)
        {
            minPos = curPos;
            for(int i =curPos; i<arr.length;i++)
            {
                if(arr[minPos]>arr[i])
                {
                    minPos=i;
                }

            }
            stringSwap(arr,curPos,minPos);
        }
    }
    */
    public static void stringSwap(String[] arr, int i, int j){



    }
}
