import javax.rmi.CORBA.Util;

public class Team3SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) //array pf 10,000 random ints. sort list and return median
    {
        insertionSort(arr);
        return median(arr);
    }

    public int challengeTwo(String[] arr, String query) { //10,000 random strings length 5. sort list. determine if it contains a given string. return the index of the first instance or -1 if not found
        bubbleSort(arr);
        return search(arr, query);
    }

    public int challengeThree(int[] arr) { //mostly sorted array of 100,000 ints. sort list and return median
        insertionSort(arr);
        return median(arr);
    }

    public int challengeFour(int[][] arr) { //two dimensional array. 1,000 by 1,000 with random integers between 0 and 10,000

    }

    public int challengeFive(Comparable[] arr, Comparable query) { //array of 10,000 objects that implement comparable. sort using compareTo method. return position of the object or -1.
    //you must use a stable sort



    }

    public String greeting(){
        return "Beware Team 3!! OwO.";
    }


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

    public static int search(String [] arr, String query){
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals(query)){
                return i;
            }
        }
        return -1;
    }

    public static void twoDimensionSort(int [][] arr) {
        for(int i=0; i<arr.length; i++){
            insertionSort(arr[i]);
            median(arr[i]);
        }

        for(int i=0; i<arr.length; i++){



        }
    }
}

