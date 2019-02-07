import java.util.Collections;

public class Team7SortCompetition extends SortCompetition {


    public int challengeOne(int[] arr) {
       quickSort(arr,0,arr.length-1);
       int median=0;
       if(arr.length %2 ==0) {
           median= (arr[arr.length/2] + arr[arr.length/2-1])/2;
       }
       else if(arr.length %2 != 0) {
            median= arr[arr.length/2];
       }
        return median;
    }

    public int challengeTwo(String[] arr, String query) {
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(query) < 0) {
                return -1;
            }else{
                return i;
            }
        }
        return 0;
    }

    public int challengeThree(int[] arr) {
        return 0;
    }

    public int challengeFour(int[][] arr) {
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        Collections.sort(arr);


    }

    public String greeting() {
        return "Hi Mr. Levin! We're Team 7 and we're going to win this FREAKING COMPETITION!";
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static int[] randIntArr(int Count) {
        int[] array = new int[Count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Count + 1);
        }
        return array;
    }

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
            array[num]= s;
        }
        return array;
    }

    public static String printStrArr(String[] arr) {
        String r= "";
        for(int i=0; i<arr.length; i++) {
            r= r+ "[" + arr[i] + "]";
        }
        return r;
    }


    public static String printArr(int[] arr) {
        String r= "  ";

        for(int num : arr) {
            r=r+" " +num + " ";
        }
        return r;
    }

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static void mergeSort(String[] arr){
        if(arr.length >= 2){
            String[] left = new String[arr.length/2];
            String[] right = new String[arr.length- arr.length/2];
            for (int i = 0; i< left.length; i++){
                left[i] = arr[i];
            }
            for(int i =0; i < right.length;i++){
                right[i] = arr[i+arr.length/2];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr,left,right);
        }
    }
    public static void merge(String[]arr, String[]left, String[]right){
        int a = 0;
        int b = 0;
        for (int i = 0; i<arr.length;i++){
            if(b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
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
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
////