public class Team11SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return FindMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            insertionSort(arr[i]);
        }
        int[] med=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            med[j]=FindMedian(arr[j]);
        }
        insertionSort(med);
         return(FindMedian(med));
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        insertionSort(arr);
        return binarySearch(arr,query);
    }

    @Override
    public String greeting() {
        return "Ari is not gonna win. We are Team 11 BTW \n Allen and Johnathan";
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
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
    public static void insertionSort(int[] arr)
    {
        int currentPos=1;
        for(int i=1; i<arr.length; i++)
        {
            for(int j=i; j>0; j--)
            {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j,j-1 );
                }else if(arr[j]>arr[j-1]){
                    break;
                }
            }
        }
    }

    public static void insertionSort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j-1].compareTo(arr[j]) > 0){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void swap(Comparable[] arr, int i, int j){
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int FindMedian(int[] arr){
        if(arr.length%2==0){
            return (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        } else {
            return arr[arr.length/2];
        }
    }
    public static int binarySearch(Comparable[] arr, Comparable x) {
        int l = 0;
        int L = arr.length - 1;
        while (l <= L) {
            int m = l + (L - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                L = m - 1;
        }
        return -1;
    }






}
