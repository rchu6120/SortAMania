public class Team2SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        BubbleSort(arr);
       int median= arr[4999];
       return median;
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        quickSort(arr,0,arr.length-1);
        for (int i=0; i<arr.length; i++)
        {
         if (arr[i].equals(query))
         {
             return i;
         }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        int median = arr[49999];
        return median;
    }

    @Override
    public int challengeFour(int[][] arr)
    {
        int i=0;
        int[] medians= new int[1000];
        for( i=0; i<arr.length; i++)
        {
            BubbleSort(arr[i]);
            medians[i]= arr[i][499];

        }
        BubbleSort(medians);
        return medians[499];

    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        quickSortComparable(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(query) >= 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String greeting() {
        return "Hello, we are Team 2 but we'll be 20th place.";
    }




    public void mergeSortHelper (int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1, right, temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public void mergeSort(int[] arr)
    {
        int n= arr.length;
        int[] temp= new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp){
        int i = from;
        int j = mid + 1;
        int k = from;

        while(i <= mid && j <= to){
            if (elements[i] < elements[j]){
                temp[k] = elements [i];
                i++;
            }
            else{
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            temp[k] = elements[i];
            i++;
            k++;
        }
    }

    //public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapComparable(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

        public static void BubbleSort(int[] arr) {
            int[] arrTemp = arr;
            int swaps = -1;
            while (swaps != 0) {
                swaps = 0;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                        swaps++;
                    }
                }
            }
        }

        public static void quickSort(String[] arr,int start, int end)
        {
            int i=start;
            int j=end;
            if(j-i>=1)
            {
                String pivot= arr[i];
                while(j>i)
                {
                    while (arr[i].compareTo(pivot) <= 0 && i < end && j > i) {
                        i++;

                    }
                    while (arr[j].compareTo(pivot) >= 0 && j > start && j >= i){
                        j--;
                    }
                    if (j > i)
                        swap(arr, i, j);
                }
                swap(arr, start, j);
                quickSort(arr, start, j - 1);
                quickSort(arr, j + 1, end);
            }
        }

    public static void quickSortComparable(Comparable[] arr,int start, int end)
    {
        int i=start;
        int j=end;
        if(j-i>=1)
        {
            Comparable pivot= arr[i];
            while(j>i)
            {
                while (arr[i].compareTo(pivot) <= 0 && i < end && j > i) {
                    i++;

                }
                while (arr[j].compareTo(pivot) >= 0 && j > start && j >= i){
                    j--;
                }
                if (j > i)
                    swapComparable(arr, i, j);
            }
            swapComparable(arr, start, j);
            quickSortComparable(arr, start, j - 1);
            quickSortComparable(arr, j + 1, end);
        }
    }

        public static void insertionSort(int[] arr){
        for (int i = 1; i <arr.length; i++){
            for (int j=i; j > 0; j--){
                if (arr[j]<arr[j-1]) {
                    Team2SortCompetition.swap(arr, j, j - 1);
                }
                else if (arr[j]>arr[j-1]){
                    break;
                }
            }
        }
        }
    }
