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
