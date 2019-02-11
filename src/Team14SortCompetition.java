public class Team14SortCompetition extends SortCompetition
{

    @Override
    public String greeting()
    {
        return "We are Team14, If we win, please send V-bucks to chenBrian@fortnite.edu";
    }



    //Swapping methods:


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

    public static void swap(Comparable[] arr, int x, int y) {
        Comparable temp = arr[x];
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
        insertionSort(arr, 0, arr.length-1);
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
            if (arr[x].equals(query))
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
        insertionSort(arr,0, arr.length-1);
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
        int[] median = new int[arr.length];
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[j].length; i++)
            {
                temp[i]=arr[j][i];
            }
            insertionSort(temp,0,temp.length-1);
            median[j] = getMedian(temp);
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
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }
        return -1;
    }

    //__________________________________________________________________________________________________________________

                                                                                                                        //Sorting Algorithms
    public static void insertionSort(int [] in, int left, int right)
    {
        for (int i =left; i < right +1; i++)
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

    public static void selectionSort(Comparable [] arr)
    {
        int i; int j; int min;
        for (i = 0; i < arr.length-1; i++)
        {
            min = i;
            for (j = i+1; j < arr.length; j++)
            {
                // arr[j]<arr[min]
                if (arr[j].compareTo(arr[min]) > 0)
                {
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }






}
