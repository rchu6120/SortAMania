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
        while (i <= mid && j <= to)
        {
            if(findMedian(arr2,i) < findMedian(arr2,j))
            {
                temp[k] = arr2[i];
                i++;
            }
            else
                {
                    temp[k] = arr2[j];
                    j++;
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
    public static int findMedian(int[][] arr, int where)
    {
        int length = arr[where].length;
        int middle = length/2;
        int median = 0;
        if(length % 2 == 0)
        {
            median = (arr[where][middle]+arr[where][middle-1])/2;
        }
        else
        {
            median = arr[where][middle];
        }
        return median;
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

   public static void selectionSort(String[] arr)
    {
        for (int j = 0; j < arr.length-1; j++){
            int min = j;
            for(int k = j+1; k <arr.length; k++){
                if (arr[k].compareTo(arr[min]) < 0) min =k;
                stringSwap(arr,j,min);
            }

        }
    }
    public static int indexOfArrayOfStrings(String[] arr,){

    }
    String [] TestArr = {"Arr", "Tell", "weather","car"};
    public static void stringSwap(String[] arr, int i, int j){
        String a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;

    }

    public Comparable[] randomThingArr(int num)
    {
        Comparable[] things = new Comparable[num];
        for(int i = 0; i<num;i++)
        {
            things[i] = new Comparabl();
        }
        return things;
    }
    public static void objMerge(Comparable[] arr3, int from, int mid, int to, Comparable[] temp)
    {
        int a = from;
        int b = mid+1;
        int c = from;

        while(a<= mid && b <= to)
        {
            if (arr3[a].compareTo(arr3[b])>-1)
            {
                temp[c] = arr3[a];
            }
            else
            {
                temp[c] = arr3[b];
            }
            c++;
        }
        while(a <= mid)
        {
            temp[c] = arr3[a];
            a++;
            c++;
        }
        while (b<= to)
        {
            temp[c] = arr3[b];
            c++;
            b++;
        }
    }
    public static void objMergeSortHelper(Comparable[] arr3, int from, int to , Comparable[] temp)
    {
        if(from<to)
        {
            int middle = (from+to)/2;
            objMergeSortHelper(arr3, from, middle, temp);
            objMergeSortHelper(arr3, from, middle, temp);
            objMerge(arr3, from, middle, to, temp);
        }
    }
    public static void objMergeSort(Comparable[] arr3)
    {
        int n = arr3.length;
        Comparable[] temp = new Comparable[n];
        objMergeSortHelper(arr3,0,n-1,temp);
    }
}
