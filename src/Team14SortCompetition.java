public class Team14SortCompetition extends SortCompetition
{
    public static void swap(double[] arr, int x, int y) {
        double temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap(String[] arr, int x, int y) {
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    //__________________________________________________________________________________________________________________

    public static int[] copyArr (int [] arr) {
        int[] out = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static String[] copyArr (String [] arr) {
        String[] out = new String[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static double[] copyArr (double [] arr) {
        double[] out = new double[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    //__________________________________________________________________________________________________________________

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int x = 0; x < count; x++)
            arr[x] = (int) (Math.random() * 10001);
        return arr;
    }

    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int x = 0; x < count; x++)
            arr[x] = (Math.random() * 10001);
        return arr;
    }

    public static String[] randStringArr(int count, int length) {
        String [] arr = new String [count];
        while (count > 0)
        {
            int i = 0;
            String s = "";
            while (i<length)
            {
                char c = (char) ((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            count--;
            arr [count] = s;
        }
        return arr;
    }

    //__________________________________________________________________________________________________________________

    public static void printArr(int [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    public static void printArr(double [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    public static void printArr(String [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    // __________________________________________________________________________________________________________________

    public static boolean isSorted (int [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i] > in [i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted (double [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i] > in [i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted (String [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i].compareTo(in [i+1]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    //__________________________________________________________________________________________________________________

    public static boolean checkSum (double [] a, double [] b) {
        double sum1 = 0;
        double sum2 = 0;

        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++)
        {
            sum2 = sum2 + b[i];
            sum1 = sum1 + a[i];
        }

        return sum1 == sum2;

    }

    public static int getMedian (int [] arr)
    {
        if (arr.length % 2 != 0)
        {
            return (int)(arr[(arr.length / 2) + 1 ]);
        }
        // if even
        else
        {
            return (int)(arr [arr.length / 2] + arr [ (arr.length / 2 ) - 1 ] ) / 2;
        }
    }
    //__________________________________________________________________________________________________________________


    @Override
    public int challengeOne(int[] arr)
    {
        insertionSort(arr);
        return getMedian(arr);

    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        int y = 0;
        bubbleSort(arr);
        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x].indexOf(query) > 0 )
            {
                return x;
            }

        }
        return -1;
    }


    // done
    @Override
    public int challengeThree(int[] arr)
    {
        insertionSort(arr);
        return getMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr)
    {
        int x = 0;
        int[] median = new int[1000];
        int[] temp = new int[1000];
        for (int j = 0; j < 1000; j++)
        {
            for (int i = 0; i < 1000; i++)
            {
                temp[i]=arr[i][j];
            }
            insertionSort(temp);
            median[x] = getMedian(temp);
            x++;
            j++;
        }
        insertionSort(median);
        return getMedian(median);
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        for (int i = 0; i < arr.length; i++)
        {
            mergeSort(arr);
        }
        return -1;
    }

    @Override
    public String greeting()
    {
        return "We are Team14, If we win, please send V-bucks to chenBrian@fortnite.edu";
    }
    //__________________________________________________________________________________________________________________


    //Sorting Algorithms
    public static void insertionSort(int [] in)
    {
        for (int i =0; i < in.length; i++)
        {
            for(int a = i; a >0; a--)
            {
                if (in[a]<in[a-1])
                {
                    swap(in,a,a-1);
                }
                else a = 0;
            }
        }
    }

    public static void bubbleSort(String[] list1) {
        int swap = 1;
        int y;
        while (swap != 0) {
            swap = 0;
            for (int x = 0; x < list1.length - 1; x++) {
                y = x + 1;
                if (list1[y].compareTo(list1[x]) < 0) {
                    swap(list1, x, y);
                    swap++;
                }
            }
        }
    }

    public static void selectionSort(double[] arr) {
        int i; int j; int min;
        for (i = 0; i < arr.length-1; i++)
        {
            min = i;
            for (j = i+1; j < arr.length; j++)
            {
                if (arr[j]<arr[min])
                {
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }

    public void mergeSort(Comparable [] arr)
    {
        int n = arr.length;
        Comparable [] temp = new Comparable[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public void mergeSortHelper (Comparable [] arr, int left, int right, Comparable [] temp)
    {
        if (left > right)
        {
            int mid = (left + right)/2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid+1, right, temp);
            merge (arr, left, mid, right, temp);
        }
    }

    public void merge (Comparable [] elements, int from, int mid, int to, Comparable []temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to)
        {
            if (elements[i].compareTo(elements[j])<0)
            {
                temp [k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp [k] = elements[i];
            i++;
            k++;
        }

        while (j <= to)
        {
            temp [k] = elements[j];
            j++;
            k++;
        }

        for (k = from; k <= to; k++)
        {
            elements[k] = temp [k];
        }
    }


}
