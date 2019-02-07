public class Team2SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        BubbleSort(arr);
       int median= arr[4999];
       return median;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Hello, we are Team 2 but we'll be #1";
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
    }

//}
