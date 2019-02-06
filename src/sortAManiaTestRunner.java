public class sortAManiaTestRunner extends Team8SortCompetition {

    public static void main(String[] args) {

        SortCompetition team1 = new Team8SortCompetition();
        int[] randIntArr = randIntsArr(14);
        int[] mostlySorted = {2003, 2567, 2679, 3567, 4433, 5421, 5331, 4000};
        //String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printIntArr(mostlySorted);

        long time = System.currentTimeMillis();
        //int median = team1.challengeOne(randIntArr);
        int median2 = team1.challengeThree(mostlySorted);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        //System.out.println("Median equals: " + median);
        System.out.println("Median equals: " + median2);

        System.out.println("Sorted");
        printIntArr(mostlySorted);
    }
}
