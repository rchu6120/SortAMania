public class Team11SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSort3(arr,0,arr.length-1);
        return FindMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {

        quickSortString(arr, 0,arr.length-1);
        return binarySearch(arr, 0, arr.length-1, query, arr.length);

    }

    @Override
    public int challengeThree(int[] arr) {
        mergeSort(arr);
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
        return binarySearch(arr, query);
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

    public static int binarySearch(String[] arr, int low, int high, String target, int arrayLength)
    {
        if(high >= low)
        {
            int mid = low + (high - low)/2;

            if( ( mid == 0 || target.compareTo(arr[mid-1])>0) && arr[mid].equals(target)) {
                return mid;
            }
            else if(target.compareTo(arr[mid])>0) {
                return binarySearch(arr, (mid + 1), high, target, arrayLength);
            }
            else {
                return binarySearch(arr, low, (mid - 1), target, arrayLength);
            }
        }
        return -1;
    }

    public static void mergeSort(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right,int[]temp){
        if(left<right){
            int mid=(left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void insertionSort(int[] arr)
    {
        for (int i=1; i<arr.length; i++)
        {
            int currentVal = arr[i];
            int lastVal = i-1;
            while (lastVal>=0 && arr[lastVal] > currentVal)
            {
                arr[lastVal+1] = arr[lastVal];
                lastVal = lastVal-1;
            }
            arr[lastVal+1] = currentVal;
        }
    }

    public static void insertionSort(Comparable[] arr){
        for (int i=1; i<arr.length; i++)
        {
            Comparable currentVal = arr[i];
            int lastVal = i-1;
            while (lastVal>=0 && arr[lastVal].compareTo(arr[i])>0)
            {
                arr[lastVal+1] = arr[lastVal];
                lastVal = lastVal-1;
            }
            arr[lastVal+1] = currentVal;
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

    public static String printStringArr(String[] arr)
    {
        String result="";

        for(String num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }
    public static String printDoubleArr(double[] arr)
    {
        String result="";

        for(double num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    public static String printIntArr(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }
    public static String printInt2Arr(int[][] arr)
    {
        String result="";

        for(int[] num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    public static String printMultiArr(int[][] arr){
        String result="";

        for(int[] num: arr)
        {
            result= result+ " " + num;
        }
        return result;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high)
    {


        if (low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition2(int[] arr, int low, int high)
    {
        int endNum=arr[high];
        int begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        int middle=arr[middleIndex];

        if(begNum > middle)
        {
            swap(arr, low, middleIndex);
        }
        if(begNum>endNum)
        {
            swap(arr, low, high);
        }
        if(middle > endNum)
        {
            swap(arr, middleIndex,high);
        }

        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void quickSort2(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition2(arr, low, high);

            quickSort2(arr, low, pi-1);
            quickSort2(arr, pi+1, high);
        }
    }


    public static int partition3(int[] arr, int low, int high)
    {

        int endNum=arr[high];
        int begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        int middle=arr[middleIndex];

        if(middle < endNum)
        {
            swap(arr, high, middleIndex);
        }
        if(begNum < endNum)
        {
            swap(arr, low, high);
        }
        if(middle<begNum)
        {
            swap(arr, middleIndex,low);
        }


        int pivot = arr[low];


        int i = (low-1);
        int j= (high+1);

        while(true)
        {
            do {
                i++;
            }
            while(arr[i] < pivot);


            do{
                j--;
            }
            while(arr[j] >pivot);


            if(i>=j)
            {
                return j;
            }
            swap(arr, i,j);
        }
    }

    public static void quickSort3(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition3(arr, low, high);
            quickSort3(arr, low, pi);
            quickSort3(arr, pi+1, high);
        }
    }

    public static int stringPartition(String[] arr, int low, int high)
    {

        String endNum=arr[high];
        String begNum=arr[low];
        int middleIndex= (int)((low+high)/2);
        String middle=arr[middleIndex];

        if(middle.compareTo(endNum)<0)
        {
            swap(arr, high, middleIndex);
        }
        if(begNum.compareTo(endNum)<0)
        {
            swap(arr, low, high);
        }
        if(middle.compareTo(begNum)<0)
        {
            swap(arr, middleIndex,low);
        }

        String pivot = arr[low];


        int i = (low-1);
        int j= (high+1);

        while(true)
        {
            do {
                i++;
            }
            while(arr[i].compareTo(pivot)<0);


            do{
                j--;
            }
            while(arr[j].compareTo(pivot)>0);


            if(i>=j)
            {
                return j;
            }
            swap(arr, i,j);
        }
    }

    public static void quickSortString(String[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = stringPartition(arr, low, high);
            quickSortString(arr, low, pi);
            quickSortString(arr, pi+1, high);
        }
    }

}
