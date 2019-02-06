public class Utility {


    public static void stringSwap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(String[] arr) {
        int thru = 1;
        while (thru > 0) {
            thru = 0;
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x].compareToIgnoreCase(arr[x + 1]) > 0) {
                    stringSwap(arr, x, x + 1);
                    thru++;
                }
            }
        }
    }


    public static String[] arr(int count) {
        String[] arr = new String[count];
        int i = 0;
        String s = "";
        while (i < arr.length) {
            char c = (char) ((Math.random() * 26) + 97);
            s = s + c;
            i++;
        }
        return arr;
    }

    public static int[] arrInt(int count) {
        String[] arr = new String[count];
        int i = 0;
        int n = 0;
        while (i < arr.length) {
            n = (int) ((Math.random() * 11) - 1);
            i++;
        }
        return arrInt(7);
    }

    public static double[] arrDouble(int count) {
        String[] arr = new String[count];
        int i = 0;
        double n = 0;
        while (i < arr.length) {
            n = ((Math.random() * 11) - 1);
            i++;
        }
        return arrDouble(7);
    }

    public static boolean sortCheck(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }


    public static boolean sortCheck(double[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }


    public static boolean sortCheck(String[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            if (arr[x].compareTo(arr[x + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int sum = 0;
        for (int x = 0; x < before.length; x++) {
            sum = sum + before[x];
        }
        int other = 0;
        for (int y = -0; y < after.length; y++) {
            other = other + after[y];
        }
        if (sum == other) {
            return true;
        }
        return false;
    }

    public static void doubleSwap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void intSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(double[] arr) {
        int minPos = 0;
        double minVal = 0;
        for (int curPos = 0; curPos < arr.length - 1; curPos++) {
            minVal = arr[curPos];
            minPos = curPos;
            for (int i = 0; i < arr.length; i++) {
                if (minVal > arr[i]) {
                    minVal = arr[i];
                    minPos = i;
                }
            }
            doubleSwap(arr, curPos, minPos);
        }

    }

    public static void insertionSort(int[] arr) {
        for (int curPos = 0; curPos < arr.length; curPos++) {
            if (arr[curPos] > arr[curPos + 1]) {
                for (int x = curPos; x >= 0; x--) {
                    if (arr[curPos] > arr[curPos + 1]) {
                        intSwap(arr, curPos, curPos + 1);
                    }
                }
            }
        }
    }

    public static void mergeSort(int[] arr)
    {
        int n=arr.length;
        int[] temp= new int[n];
        mergeHelper(arr, 0, n-1, temp);
    }

    public static void mergeHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left<right)
        {
            int mid= (left+right)/2;
            mergeHelper(arr, left, mid, temp);
            mergeHelper(arr, mid+1, right, temp);
            merge(arr, left, mid, right, temp);

        }
    }

    public static void merge(int[] elements,
                             int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
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

    public static int median(int[] arr)
    {
        if(arr.length % 2 == 0)
        {
            return ((arr[arr.length/2 +1])+(arr[arr.length/2 -1]))/2;
        }
        else{
            return (arr[arr.length/2]);
        }
    }

}
