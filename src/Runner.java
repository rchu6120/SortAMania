public class Runner {
    public static int[] randomIntsArr(int length){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr [i] = (int)(Math.random() *10000 +1);
        }
        return arr;
    }

    public static String[] randomStringArr(String arr){

    }

    public static void main (String[] args) {
        SortCompetition team2 = new Team2SortCompetition();
        int[] randomIntsArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randStringArr);

        long time = System.currentTimeMillis();
        int median = team2.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}
