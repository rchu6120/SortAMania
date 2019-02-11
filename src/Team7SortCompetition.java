//Authors: Benjamin Wu, Jason Tan, Byron Chen
public class Team7SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        int median = 0;
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        } else if (arr.length % 2 != 0) {
            median = arr[arr.length / 2];
        }
        return median;
    }

    public int challengeTwo(String[] arr, String query) {
        int a = -1;
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(query)) {
                a = i;
            }
        }
        return a;
        return a;
    }

    public int challengeThree(int[] arr) {
        insertionSort3(arr,0, arr.length-1);
        return getMedian3(arr);
    }

    public int challengeFour(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            insertionSort(arr[i]);
        }
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            medians[i] = getMedian(arr[i]);
        }
        insertionSort(medians);
        return (getMedian(medians));
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        insertionSort(arr);
        return binarySearch(arr, query);
    }

    public String greeting() {
        return "Hi Mr. Levin! We're Ben, Jason, Byron and we're team 7";
    }

    //----------------------------------------------------------------------------------------------------------------
    //Creates random Int Arr
    public static int[] randIntArr(int Count) {
        int[] array = new int[Count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Count + 1);
        }
        return array;
    }

    //Creates random String arr
    public static String[] randStringArr(int num, int length) {
        String[] array = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            array[num] = s;
        }
        return array;
    }

    //Prints String Arr
    public static String printStrArr(String[] arr) {
        String r = "";
        for (int i = 0; i < arr.length; i++) {
            r = r + "[" + arr[i] + "]";
        }
        return r;
    }

    //Prints Int Arr
    public static String printArr(int[] arr) {
        String r = "  ";

        for (int num : arr) {
            r = r + " " + num + " ";
        }
        return r;
    }

    //Quicksort (Challenge One)
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    //Challenge Two
    public static void mergeSort(String[] arr) {
        if (arr.length >= 2) {
            String[] left = new String[arr.length / 2];
            String[] right = new String[arr.length - arr.length / 2];
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[i + arr.length / 2];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    public static void merge(String[] arr, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                arr[i] = left[a];
                a++;
            } else {
                arr[i] = right[b];
                b++;
            }
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
    //Challenge Three
    public static void insertionSort3(int [] in, int left, int right)
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
    public static int getMedian3 (int [] arr)
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
    //Challenge Four
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int getMedian(int[] sortedArray) {
        int l = sortedArray.length;
        int mid = l / 2;
        if (l == 0) {
            return -1;
        }
        if (l % 2 == 0) {
            return ((sortedArray[mid] + sortedArray[mid - 1]) / 2);
        } else {
            return (sortedArray[mid]);
        }
    }

    //ChallengeFive
    public static void insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static int binarySearch(Comparable[] arr, Comparable x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}