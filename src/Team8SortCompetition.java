public class Team8SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        int length = arr.length;

        for (int gap = length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i += 1) {
                int temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        if (length%2 != 0) {
            return (int)arr[length/2];
        } else {
            return (int)(arr[(length - 1)/2] + arr[length/2])/2;
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query){
        for (int i = 0; i < arr.length/2; i++){
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j+1])>0) {
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j].compareToIgnoreCase(arr[j-1])<0) {
                    String tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        for(int a = 0; a < arr.length; a++){
            if(arr[a].indexOf(query)>-1){
                return a;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr) {

        int length = arr.length;

        for (int i = 1; i < length; i++) {
            for (int count = i; count > 0; count--) {
                if (arr[count] < arr[count-1]) {
                    swapInt(arr, count, count-1);
                }
            }
        }

        if (length%2 != 0) {
            return (int)arr[length/2];
        } else {
            return (int)(arr[(length - 1)/2] + arr[length/2])/2;
        }
    }

    @Override
    public int challengeFour(int[][] arr) {
        int[] medianArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            medianArr[i] = challengeOne(arr[i]);
        }

        modShellSort(medianArr, arr);

        int length = medianArr.length;

        if (length%2 != 0) {
            return (int)medianArr[length/2];
        } else {
            return (int)(medianArr[(length - 1)/2] + medianArr[length/2])/2;
        }

    }
    @Override

    public int challengeFive(Comparable[] arr, Comparable query) {
        for (int i = 0; i < arr.length/2; i++){
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1])>0) {
                   swapObj(arr, j, j+1);
                    swapped = true;
                }
            }
            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j].compareTo(arr[j-1])<0) {
                   swapObj(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for (int a = 0; a < arr.length; a ++){
            if (arr[a] == query){
                return a;
            }
        }
        return -1;
    }

    @Override
    public String greeting() {
        return null;
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
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

    public static void modShellSort(int[] medArr, int[][] fullArr) {
        int length = medArr.length;

        for (int gap = length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i += 1) {
                int temp = medArr[i];
                int[] temporary = fullArr[i];

                int j;
                for (j = i; j >= gap && medArr[j - gap] > temp; j -= gap) {
                        medArr[j] = medArr[j - gap];
                        fullArr[j] = fullArr[j-gap];
                }
                medArr[j] = temp;
                fullArr[j] = temporary;
            }
        }
    }

    public static int[] randIntsArr(int count) {
        int[] list= new int[count];
        for (int i=0; i<list.length; i++)
        {
            list[i]=(int) (Math.random() *10001);
        }
        return list;
    }

    public static String[] randomStringArr(int count, int length) {
        String[] arr = new String[count];

        while (count > 0) {
            int i = 0;
            String s = "";

            while(i < length) {
                char c = (char)((Math.random()*26) + 97);
                s = s + c;
                i++;
            }

            count--;
            arr[count] = s;
        }

        return arr;
    }

    public static int[][] random2DIntArray(int width, int length) {
        int[][] arr = new int[width][length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10001);
            }
        }

        return arr;
    }


    public static Comparable[] randomObjArr(int num){
        Comparable[] objects = new Comparable[num];
        for (int i = 0; i < num; i++){
            objects[i] = new Object();
        }
        return objects;
    }

    public static void Swap(String[] array, int x, int y)
    {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void swapInt (int[] list1, int a, int b) {
        int temp = list1[a];
        list1[a] = list1[b];
        list1[b] = temp;
    }

    public static void swapRows(int array[][], int rowA, int rowB) {
        int temp[] = array[rowA];
        array[rowA] = array[rowB];
        array[rowB] = temp;
    }

    public static void swapObj(Comparable[] arr, int a, int b){
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void printIntArr(int [] arr) {
        for (int num:arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void printStringArr(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +"\n");
        }
    }

    public static void printArray(Comparable[] arr){
        String str="";
        for(int i =0; i<arr.length;i++){
            str = str + arr[i] + ", ";
        }
        System.out.println(str);
    }

    public static void print2DIntArr(int[][] arr) {
        String line = "";

        for (int i = 0; i < arr.length; i++) {
            String row = "";
            for (int j = 0; j < arr[i].length; j++) {
                row += arr[i][j] + "  ";
            }

            line += row + "\n";
        }

        System.out.println(line);
    }
    public static boolean isSorted(Comparable[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i].compareTo(arr[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

}


