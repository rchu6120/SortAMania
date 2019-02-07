public class SortAManiaTestRunner {

    public static void main(String[] args)
    {
        SortCompetition team4 = new Team4SortCompetition( );
        //create instance of class
        int[] randIntArr = randomIntsArr(num: 10000);
        //initialize a random int array
        String[] randStringArr = randomStringArr(num: 10000, length:5);
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
}
