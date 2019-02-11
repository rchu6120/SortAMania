public class Team13SortCompetition extends SortCompetition
{
    public static void merge(int[] arr, int from, int mid, int to, int[] temp)
    {
        int x = from;
        int y = mid + 1;
        int z = from;

        while (x <= mid && y <= to)
        {
            if (arr[x] < arr[y])
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
        while (y <= to)
        {
            temp[z] = arr[y];
            z++;
            y++;
        }
        for(z = from; z<= to; z++)
        {
            arr[z] = temp[z];
        }
    }
    private static void mergeSortHelper(int[] arr, int from, int to, int[] temp) {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(arr, from, middle, temp);
            mergeSortHelper(arr, middle+1, to, temp);
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
            k++;
        }
        while(i<= mid)
        {
            temp[k] = arr2[i];
            i++;
            k++;
        }
        while(j<= to)
        {
            temp[k] = arr2[j];
            j++;
            k++;
        }
        for(k = from; k<= to; k++)
        {
            arr2[k] = temp[k];
        }
    }
    public static void doubleMergeSortHelper(int[][] arr2, int from, int to, int[][] temp)
    {
        if(from<to)
        {
            int middle = (from + to)/2;
            doubleMergeSortHelper(arr2,from,middle,temp);
            doubleMergeSortHelper(arr2,middle+1, to, temp);
            doubleMerge(arr2,from,middle,to,temp);
        }
    }
    public static void doubleMergeSort(int[][] arr2)
    {
        int n = arr2.length;
        int m = arr2[999].length;
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

        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void stringSwap(String[] arr, int i, int j){
        String a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;

    }

    public static void selectionSort(String[] arr)
    {
        for (int j = 0; j < arr.length-1; j++){
            int min = j;
            for(int k = j+1; k <arr.length; k++){
                if (arr[k].compareTo(arr[min]) < 0) min =k;
                String temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }

        }
    }
    public static int indexOfArrayOfStrings(String[] arr,String query){
        for(int i = 0; i < arr.length;i++){
            if( arr[i] == query){
                return i;
            }
        }
        return -1;
    }
    String [] TestArr = {"Arr", "Tell", "weather","car"};

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
                a++;
            }
            else
            {
                temp[c] = arr3[b];
                b++;
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
            objMergeSortHelper(arr3, middle+1, to, temp);
            objMerge(arr3, from, middle, to, temp);
        }
    }
    public static void objMergeSort(Comparable[] arr3)
    {
        int n = arr3.length;
        Comparable[] temp = new Comparable[n];
        objMergeSortHelper(arr3,0,n-1,temp);
    }

    public static int[][] doubleRandIntArr()
    {
        int[][] doubleArr = new int [1000][1000];
        for(int i = 0; i<doubleArr.length;i++)
        {
            for (int j =0; j<doubleArr[i].length;j++)
            {
                doubleArr[i][j] = (int)(Math.random()*10000);
            }
        }
        return doubleArr;
    }
    
    public static int getMedian(int[] arr) {
        // to find the median
        int middle = arr.length / 2;
        int median = 0;
        if (arr.length % 2 == 1)
            median = arr[middle];
        else
            median = (arr[middle - 1] + arr[middle]) / 2;
        return median;
    }
    @Override
    public int challengeOne(int[] arr)
    {
        mergeSort(arr);
        int front = arr.length/2;
        int back = arr.length/2 +1;
        int median = 0;
        if(arr.length%2 ==0) {
            median = (arr[front] + arr[back]) / 2;
        }
        else
            median = arr[front];
        return median;
    }
    @Override
    public int challengeTwo(String[] arr, String query) {
            selectionSort(arr);

        return indexOfArrayOfStrings(arr,query);
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return getMedian(arr) ;
    }
    //Insertion sort for the win.
    @Override
    public int challengeFour(int[][] arr)
    {
        int place = 0;
        return place;
    }
    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        int re=-1;
        objMergeSort(arr);
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] == query)
            {
                re = i;
                return re;
            }
        }
        return re;
    }

    @Override
    public String greeting() {
        return "Welcome to Camp Crystal Lake";
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
}
