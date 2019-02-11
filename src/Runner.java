public class Runner {

    public static void main(String[] args) {
        SortCompetition team3 = new Team3SortCompetition();
        int[] randIntArr = randomIntArr(1000);
       // String[] randStringArr = randomStringArr(1000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team3.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }

    private static void printArr(int[] randIntArr) {
        System.out.println(randIntArr);
    }

//    private static String[] randomStringArr(int num, int length) {
//
//    }

    private static int[] randomIntArr(int num) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()) * 1000;
        }
        return arr;
    }
}
