public class Team14SortCompetition extends SortCompetition
{

    @Override
    public String greeting()
    {
        return "We are Team14, If we win, please send V-bucks to chenBrian@fortnite.edu";
    }



    //Swapping methods:

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


    // Other helper methods:

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

    //Actual challenges:

    /**
     * Data Set - an array of 10,000 random integers between 0-10000
     * Task: Sort the list and return the median
     * @param arr
     * @return
     */

    @Override
    public int challengeOne(int[] arr)
    {
        timSort(arr,arr.length);
        return getMedian(arr);

    }

    /**
     * challengeTwo: String sorting and searching
     * Data Set - an array of 10,000 random strings (strings will be of length 5)
     * Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found
     * @param arr
     * @param query
     * @return
     */

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

    /**
     * challengeThree: Mostly Sorted Big Array
     * Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
     * Task: Sort the list and return the median
     * @param arr
     * @return
     */

    @Override
    public int challengeThree(int[] arr)
    {
        timSort(arr,arr.length);
        return getMedian(arr);
    }

    /**
     * challengeFour: Multi-Dimensional sorting
     * Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
     * Task: Sort each sub-array and then sort the arrays by their median value
     * @param arr
     * @return
     */

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
            insertionSort(temp,0,temp.length-1);
            median[x] = getMedian(temp);
            x++;
            j++;
        }
        insertionSort(median,0,median.length-1);
        return getMedian(median);
    }

    /**
     * challengeFive: Mystery Sort and Search
     * Data Set - an array of 10,000 objects that implement the comparable interface
     * Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
     * @param arr
     * @param query
     * @return
     */

    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        for (int i = 0; i < arr.length; i++)
        {
            mergeSort(arr);
        }
        return -1;
    }

    //__________________________________________________________________________________________________________________

                                                                                                                        //Sorting Algorithms
    public static void insertionSort(int [] in, int left, int right)
    {
        for (int i = left + 1; i <= right; i++)
        {
            int temp = in[i];
            int j = i-1;
            while (in[j] > temp && j >= left)
            {
                swap(in,j,j+1);
                j--;
            }
            in[j+1] = temp;
        }
    }

    public static void bubbleSort(String[] list1)
    {
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

    public static void selectionSort(double[] arr)
    {
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

    private static void merge(int[] elements, int from, int mid, int to)
    {
        int [] temp = new int[elements.length];
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }


    // arr is array to be sorted, n is the length of the array.
    public static int Run = 32;
    public static void timSort (int [] arr, int n)
    {
        for (int i = 0; i < n; i+= Run)
        {
            insertionSort(arr, i, Math.min(i+31,(n-1)));
        }

        for (int size = Run; size < n; size = 2*size)
        {
            for (int left = 0; left < n; left += 2*size)
            {
                int mid = left+size-1;
                int right = Math.min((left+2*size-1),(n-1));
                merge(arr, left, mid,right);
            }
        }
    }
}
