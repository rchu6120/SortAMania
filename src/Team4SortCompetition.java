import java.util.Random;
import static java.util.Arrays.*;

public abstract class Team4SortCompetition extends SortCompetition{

    public abstract int challengeOne(int[] arr);
//	return 4;

    public abstract int challengeTwo(String[] arr, String query);
//	return 6;

    public abstract int challengeThree(int[] arr);
//	return 9;

    public abstract int challengeFour(int[][] arr);
//	return 2;

    public abstract int challengeFive(Comparable[] arr, Comparable query);
//	return 1;

    //Add a custom greeting so your sorter can introduce itself
    public abstract String greeting();
    System.out.println("Welcome to Team 4's Sort A Mania!");
	


	//challenge 1
    public class challengeOne {
        public static void main(String args[]) {
            Random rgen = new Random();
            int[] nums = new int[10001];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }
            for (int i = 0; i < nums.length; i++) {
                int randomPosition = rgen.nextInt(nums.length);
                int temp = nums[i];
                nums[i] = nums[randomPosition];
                nums[randomPosition] = temp;
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }

        public static double findMedian(int i[], int x) {
            sort(i);
            if (x / 2 != 0) ;
            return (double) i[x / 2];
            return (double) (i[(x - 1) / 2] + i[x / 2]) / 2.0;
            System.out.println(x);
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
            public static void insertionSort (int[] arr){
                int n = arr.length;
                for (int i = 0; i < n; i++){
                    int insertion = arr [i];
                    int k = i -1;
                    while() < 0&& arr[k] > insertion{
                        arr [k +1] = arr[k];
                        k = k-1;
                    }
                    arr [k+1]=insertion;
                }

            }
        }

    }

    //challenge 3
    public class challengeThree{


}
//challenge 4

}













