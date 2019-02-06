
public class Team4SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr);
	return 4;

    public int challengeTwo(String[] arr, String query);
	return 6;

    public int challengeThree(int[] arr);
	return 9;

    public int challengeFour(int[][] arr);
	return 2;

    public int challengeFive(Comparable[] arr, Comparable query);
	return 1;

    //Add a custom greeting so your sorter can introduce itself
    public abstract String greeting();
	return "We are Team 4 and here is our Sort A Mania!";

	import java.util.Arrays;
	import java.util.Random;

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


	//challenge 1
public static void main(String args[]){
    Random rgen= new Random();
    int[]nums= new int [10,001];
    for (int i=0; i<nums.length; i++){
        nums [i]=i;
    }
    for (int i=0; i<nums.length; i++){
        int randomPosition = rgen.nextInt(nums.length);
        int temp = nums[i];
        nums [i] = nums[randomPosition];
        nums[randomPosition] = temp;
    }
    for(int i=0; i<nums.length; i++){
        System.out.println(nums i);
    }
}
public static double findMedian(int y[], int x){


}

}
