import java.util.Random;
import static java.util.Arrays.*;

public abstract class Team4SortCompetition extends SortCompetition{

    public abstract int challengeOne(int[] arr);
    public static double findMedian(int i[], int x) {
        sort(i);
        if (x / 2 != 0) ;
        return (double) i[x / 2];
        return (double) (i[(x - 1) / 2] + i[x / 2]) / 2.0;
        System.out.println(x);
    }
    //merge sort
    public static void mergeSort(int []elements){
        int n = elements.length;
        int [] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }
    private static void mergeSortHelper(int[]elements, int from, int to, int[]temp){
        if (from<to){
            int middle = (from+to)/2;
            mergeSortHelper(elements,from,middle,temp);
            mergeSortHelper(elements,middle+1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
    private static void merge(int[]elements, int from, int mid, int to, int[]temp){
        int i = from;
        int j = mid+1;
        int k = from;

        while (i<=mid && j<= to){
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else {
                temp [k]=elements[j];
                j++;
            }
            k++;
        }

    }




    public abstract int challengeTwo(String[] arr, String query);


    public abstract int challengeThree(int[] arr);


    public abstract int challengeFour(int[][] arr);


    public abstract int challengeFive(Comparable[] arr, Comparable query);


    //Add a custom greeting so your sorter can introduce itself
    public abstract String greeting();
	


	//challenge 1
//        public static void main(String args[]) {
//            Random rgen = new Random();
//            int[] nums = new int[10001];
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = i;
//            }
//            for (int i = 0; i < nums.length; i++) {
//                int randomPosition = rgen.nextInt(nums.length);
//                int temp = nums[i];
//                nums[i] = nums[randomPosition];
//                nums[randomPosition] = temp;
//            }
//            for (int i = 0; i < nums.length; i++) {
//                System.out.println(nums[i]);
//            }
//        }
        public static double findMedian(int i[], int x) {
            sort(i);
            if (x / 2 != 0) ;
            return (double) i[x / 2];
            return (double) (i[(x - 1) / 2] + i[x / 2]) / 2.0;
            System.out.println(x);
        }
        //merge sort
        public static void mergeSort(int []elements){
            int n = elements.length;
            int [] temp = new int[n];
            mergeSortHelper(elements, 0, n-1, temp);
        }
        private static void mergeSortHelper(int[]elements, int from, int to, int[]temp){
            if (from<to){
                int middle = (from+to)/2;
                mergeSortHelper(elements,from,middle,temp);
                mergeSortHelper(elements,middle+1, to, temp);
                merge(elements, from, middle, to, temp);
            }
        }
        private static void merge(int[]elements, int from, int mid, int to, int[]temp){
            int i = from;
            int j = mid+1;
            int k = from;

            while (i<=mid && j<= to){
                if (elements[i] < elements[j])
                {
                    temp[k] = elements[i];
                    i++;
                }
                else {
                    temp [k]=elements[j];
                    j++;
                }
                k++;
            }

        }

    //Challenge 2
    public class challengeTwo {
        public static int[]randIntArr(int count){
            int [] arr = new int [count];
            int random = (int)(Math.random()*10000);
            for (int i = 0; i < arr.length; i ++){
                arr [i] = (int)(Math.random()*10001);
            }
            return arr;
        }

    }

    //challenge 3
    public class challengeThree{


}

}













