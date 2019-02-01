public class Team12SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        // to find the median
        int middle = arr.length/2;
        int median = 0; //declare variable
        if (arr.length%2 == 1)
            median = arr[middle];
        else
            median = (arr[middle-1] + arr[middle]) / 2;
        return median;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Hello! We are team 12 :)";
    }
}
