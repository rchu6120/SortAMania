public class Team12SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        mergeSort(arr);
        return getMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        bubbleSort(arr);
        return binarySearch(arr, query);
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return getMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        {
            int[] medval = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                medval[j] = challengeThree(arr[j]);
            }
            for (int i = 0; i < medval.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (medval[j] < medval[j - 1]) {
                        swap(medval, j, j - 1);
                    }
                }
            }
            return getMedian(medval);
        }
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == query) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public String greeting() {
        return "Hello! We are team 12 :)";
    }

    // all algorithms being used above


    public static void merge(int[] elements, int from, int mid, int to, int[] temp) {
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
        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }

    public void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }


    public static int getMedian(int[] arr) {
        // to find the median
        int middle = arr.length / 2;
        int median = 0; //declare variable
        if (arr.length % 2 == 1)
            median = (int) arr[middle];
        else
            median = (int) (arr[middle - 1] + arr[middle]) / 2;
        return median;
    }

    public static void bubbleSort(String[] arr) {
        int i;
        boolean check = true;  // will determine when the sort is finished
        String temp;

        while (check) {
            check = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {         // ascending sort
                    temp = arr[i];
                    arr[i] = arr[i + 1];     // swapping according to algorithm
                    arr[i + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void selectionSort(double[] arr) {
        int minPos = 0;
        for (int curPos = 0; curPos < arr.length; curPos++) {
            double minVal = arr[curPos];
            for (int nextPos = curPos + 1; nextPos < arr.length; nextPos++) {
                if (arr[nextPos] < minVal) {
                    minVal = arr[nextPos];
                    minPos = nextPos;
                }
                swapdouble(arr, minPos, curPos);
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    //SWAP
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swapdouble(double[] arr, int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swapString(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //Random Generators
    public static int[] randomIntsArr(int count) {
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = (int) (Math.random() * 10001);
        }
        return num;
    }

    public static double[] randomDoubleArr(int count) {
        double[] num = new double[count];
        for (int i = 0; i < count; i++) {
            num[i] = (Math.random() * 10000);
        }
        return num;
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    //Copy
    public static int[] copyIntArr(int[] arr) {
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static double[] copyDoubleArr(double[] arr) {
        double[] copyArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static String[] copyStirngArr(String[] arr) {
        String[] copyArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    //CHECK
    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > i + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > i + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAlpha(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        if (before.length != after.length) {
            return false;
        }
        int sumBef = 0;
        int sumAft = 0;
        for (int i = 0; i < before.length - 1; i++) {
            sumBef = sumBef + before[i];
            sumAft = sumAft + after[i];
        }
        if (sumAft != sumAft) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkSum(double[] before, double[] after) {
        if (before.length != after.length) {
            return false;
        }
        double sumBef = 0;
        double sumAft = 0;
        for (int i = 0; i < before.length - 1; i++) {
            sumBef = sumBef + before[i];
            sumAft = sumAft + after[i];
        }
        if (sumAft != sumAft) {
            return false;
        } else {
            return true;
        }
    }

    public static int binarySearch(int[] elements, int target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < elements[middle]) {
                right = middle - 1;
            } else if (target > elements[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static double binarySearch(double[] elements, int target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < elements[middle]) {
                right = middle - 1;
            } else if (target > elements[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] elements, String target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (elements[middle].compareTo(target) < 0) {
                left = middle + 1;
            } else if (elements[middle].compareTo(target) > 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void printArr(int[] arr) {
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out + "\n");
    }

    public static void printArr(double[] arr) {
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out + "\n");
    }

    public static void printArr(String[] arr) {
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out + "\n");
    }

    //**public static Comparable[] mergeComparable(Comparable[] list1, Comparable[] list2) {
      //  int newlist = 0;
       // int newlist2 = 0;
      //  int newlist3 = 0;
      //  Comparable[] newarray = new Comparable[list1.length + list2.length];
     //   while (newlist < list1.length || newlist2 < list2.length) {
        //    if (newlist == list1.length) {
        //        newarray[newlist3] = list2[newlist2];
      //          newlist2++;
     //       } else if (newlist2 == list2.length) {
     //           newarray[newlist3] = list1[newlist];
     //           newlist++;
      //      } else if (list1[newlist].compareTo(list2[newlist2]) < 0) {
      //          newarray[newlist3] = list1[newlist];
      //          newlist++;
       //     } else {
       //         newarray[newlist3] = list2[newlist2];
        //        newlist2++;
        //    }
        //    newlist3++;
        //}
       // return newarray;

  //**  }

    public void mergeSort(Comparable[] arr) {
        int n = arr.length;
        Comparable[] temp = new Comparable[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    public void mergeSortHelper(Comparable[] arr, int left, int right, Comparable[] temp) {
        if (left > right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public void merge(Comparable[] elements, int from, int mid, int to, Comparable[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (elements[i].compareTo(elements[j]) < 0) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }
}