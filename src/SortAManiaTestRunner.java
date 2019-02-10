import java.util.Arrays;
import java.util.Random;

public class SortAManiaTestRunner {

    public static void main(String[] args) {
        SortCompetition team4 = new Team4SortCompetition();
        //create instance of class

        int[] randIntArr = randomIntsArr(10);
        //initialize a random int array

//        String[] randStringArr = randomStringArr(10000, 5);
        // initialize a random string array

        System.out.println("Unsorted");
        printArr(randIntArr); //print out the unsorted int array

        long time = System.currentTimeMillis(); // start the timer
        int median = team4.challengeOne(randIntArr); // run challenge one code
        time = System.currentTimeMillis() - time; // stop the timer
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); // print the time
        System.out.println("Median equals: " + median); // print the median you found

        System.out.println("Sorted");
        printArr(randIntArr); // check if array was sorted correctly
    }


    /** Returns array of random ints between 0 and the length of the array
     * @param length length of array, and maximum entry value
     * @return array of given length of random ints between 0 and length
     */
    public static int[] randomIntsArr(int length) {
        Random random = new Random();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(length);
        }

        return nums;
    }

    /** Returns square array of random ints between 0 and the length of the array
     * @param length length of square array, maximum entry value
     * @return square array of random ints
     */
    public static int[][] random2DIntArray(int length) {
        int[][] arr = new int[length][length];

        for (int i = 0; i < length; i++) {
            arr[i] = randomIntsArr(length);
        }

        return arr;
    }

    /** Returns array of random Strings of given length
     * @param arrayLength desired length of array
     * @param stringLength desired length of Strings
     * @return array of random Strings
     */
    private static String[] randomStringArr(int arrayLength, int stringLength) {
        String[] arr = new String[arrayLength];
        for (String s : arr) s = randomString(stringLength);
        return arr;
    }

    /** Returns random String of given length
     * @param length desired length of random String
     * @return random String of given length
     */
    public static String randomString(int length) {
        Random random = new Random();

        // choose a random Character from this String
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = random.nextInt(alphaNumericString.length());

            // append Character one by one to sb
            sb.append(alphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
