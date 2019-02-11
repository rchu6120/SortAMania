import javax.rmi.CORBA.Util;
import java.util.List;

public class Team3SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) //array pf 10,000 random ints. sort list and return median
    {
        intBubbleSort(arr);
        return median(arr);
    }

    public int challengeTwo(String[] arr, String query) { //10,000 random strings length 5. sort list. determine if it contains a given string. return the index of the first instance or -1 if not found
        stringBubbleSort(arr);
        return search(arr, query);
    }

    public int challengeThree(int[] arr) { //mostly sorted array of 100,000 ints. sort list and return median
        intBubbleSort(arr);
        return median(arr);
    }

    public int challengeFour(int[][] arr) { //two dimensional array. 1,000 by 1,000 with random integers between 0 and 10,00. return median of median array
        return twoDimensionSort(arr);

    }

    public int challengeFive(Comparable[] arr, Comparable query) { //array of 10,000 objects that implement comparable. sort using compareTo method. return position of the object or -1.
                                                                   //you must use a stable sort
        comparableSort(arr);
        return search(arr, arr.length);
    }

    public String greeting() {
        return "Beware Team 3!! UwU.";
    }


    public static void stringSwap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void intSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void stringBubbleSort(String[] arr) {
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x].compareToIgnoreCase(arr[x + 1]) > 0) {
                    stringSwap(arr, x, x + 1);
                    swaps++;
                }
            }
        }
    }

    public static void intBubbleSort(int[] arr) {
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    intSwap(arr, i, i + 1);
                    swaps++;
                }
            }
        }
    }

    public static void comparableSort(Comparable [] arr){ //challenge 5 yay. bubble sort but for comparable objects
        int swaps =1;
        while (swaps>0){
            swaps=0;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    Comparable temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp;
                    swaps++;
                }
            }
        }
    }

    public static int median(int[] arr) { //finds the median of an int array
        if (arr.length % 2 == 0) {
            return ((arr[arr.length / 2 + 1]) + (arr[arr.length / 2 - 1])) / 2;
        } else {
            return (arr[arr.length / 2]);
        }
    }

    public static int search(Object[] arr, Object query) { //searches an array for a query
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(query)) {
                return i;
            }
        }
        return -1;
    }

    public static int twoDimensionSort(int[][] arr) { //sorts the inside of the sub arrays and then sorts them in order by their medians

        for (int i = 0; i < arr.length; i++) {
            intBubbleSort(arr[i]); //sorts sub arrys OwO
        }

        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int x = median(arr[i]), y = median(arr[i + 1]);
                if (x > y) {
                    int[] temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                } //bubble sort but for the sub arrays
            }
        }

        int[] medianArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            medianArr[i] = median(arr[i]); //makes new array out of all the medianssssss <3 :D
        }

        return median(medianArr); //returns median of median array
    }


}

