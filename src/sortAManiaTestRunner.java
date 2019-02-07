public class sortAManiaTestRunner extends Team8SortCompetition {

    public static void main(String[] args) {

        SortCompetition team1 = new Team8SortCompetition();
        int[] randIntArr = randIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printIntArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        //int median2 = team1.challengeThree(mostlySorted);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);
        //System.out.println("Median equals: " + median2);

        System.out.println("Sorted");
        printIntArr(randIntArr);

        System.out.println("Unsorted");
        printStringArr(randStringArr);

        int query = team1.challengeTwo(randStringArr, "qwert");
        System.out.println("Sorted");
        printStringArr(randStringArr);
        System.out.println(""+query+"");
    }
}
