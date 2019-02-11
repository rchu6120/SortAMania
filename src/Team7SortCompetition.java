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
        return getMedian(arr);
    }

    public int challengeFour(int[][] arr) {
        int[] median = new int[arr.length];
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                temp[i] = arr[j][i];
            }
            insertionSort(temp, 0, temp.length - 1);
            median[j] = getMedian(temp);
        }
        insertionSort(median, 0, median.length - 1);
        return getMedian(median);
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        mergeSort(arr);
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

    //Challenge Five
    public static void mergeSort(Comparable[] arr) {
        int n = arr.length;
        Comparable[] temp = new Comparable[n];
        mergeSortHelper2(arr, 0, n - 1, temp);
    }

    //Challenge Five mergeSort
    public static void mergeSortHelper2(Comparable[] arr, int left, int right Comparable[]temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper2(arr, left, mid, temp);
            mergeSortHelper2(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(Comparable[] arr, int left, int mid, int right, Comparable[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }

    public static int binarySearch(Comparable[] elements, Comparable target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target.compareTo(elements[middle]) < 0) {
                right = middle - 1;
            } else if (target.compareTo(elements[middle]) > 0) {
                left = middle + 1;
            } else if (target.equals(elements[middle])) {
                return middle;
            }
        }
        return -1;
    }

    //Challenge Four
    public static void insertionSort(int[] in, int left, int right) {
        for (int i = left; i < right + 1; i++) {
            for (int a = i; a > 0; a--) {
                if (in[a] < in[a - 1]) {
                    swap(in, a, a - 1);
                } else a = 0;
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}