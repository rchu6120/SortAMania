import java.util.Arrays;
import java.util.Random;
import static java.util.Arrays.*;

public class Team4SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr){
        return (int) getMedian(arr);
    }

    public int challengeTwo(String[] arr, String query){
        return 0;
    }

    public int challengeThree(int[] third){
        return (int) getMedian(third);
    }

    public int challengeFour(int[][] arr){
        return (int) getMedian(getMedianArray(arr));
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }

    public String greeting(){
        return "Welcome to Team 4's Sort A Mania!";
    }

    /** Returns median of nonempty array of ints
     * @param ints array of ints
     * @return median of array
     */
    public static double getMedian(int[] ints) {
        int n = ints.length;

        sort(ints);

        if (n % 2 != 0) { // odd length
            return ints[n / 2]; // return middle element
        } else { // even length
            return (ints[n / 2] + ints[1 + n / 2]) * 0.5; // return average of middle two elements
        }
    }

    /** Returns median of nonempty array of doubles
     * @param doubles array of doubles
     * @return median of array
     */
    public static double getMedian(double[] doubles){
        int n = doubles.length;

        // TODO: Implement alternate sort algorithm, "sort" is ILLEGAL!
        sort(doubles);

        if (n % 2 != 0) { // odd length
            return doubles[n / 2]; // return middle element
        } else { // even length
            return (doubles[n / 2] + doubles[1 + n / 2]) * 0.5; // return average of middle two elements
        }
    }

    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to) {
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
    }

    /** Returns medians of rows of square int array
     * @param arr square int array
     * @return array of medians of rows of square int array
     */
    private static double[] getMedianArray(int[][] arr) {
        double[] medianArr = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            medianArr[i] = getMedian(arr[i]);
        }

        return medianArr;
    }




    public static void InsertionSort (int[] third) {
        int n = third.length;
        for (int i = 1; i < n; i++) {
            int key = third[i];
            int j = i - 1;

            while (j >= 0 && third[j]>key)
            {
                third[j+1] = third[j];
                j=j-1;
            }
            third[j+1]=key;
        }
    }
    public static double getSecondMedian(int[] third) {
        int n = third.length;

        sort(third);

        if (n % 2 != 0) { // odd length
            return third[n / 2]; // return middle element
        } else { // even length
            return (third[n / 2] + third[1 + n / 2]) * 0.5; // return average of middle two elements
        }
    }
    private static double[] getSecondMedianArray(int[][] third) {
        double[] medianArr = new double[third.length];

        for (int i = 0; i < third.length; i++) {
            medianArr[i] = getMedian(third[i]);
        }

        return medianArr;
    }
    public static double getSecondMedian(double[] third){
        int n = third.length;

        // TODO: Implement alternate sort algorithm, "sort" is ILLEGAL!
        sort(third);

        if (n % 2 != 0) { // odd length
            return third[n / 2]; // return middle element
        } else { // even length
            return (third[n / 2] + third[1 + n / 2]) * 0.5; // return average of middle two elements
        }
    }









}













