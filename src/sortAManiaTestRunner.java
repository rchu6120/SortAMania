public class sortAManiaTestRunner extends Team8SortCompetition {

    public static void main(String[] args) {

        SortCompetition team1 = new Team8SortCompetition();
        //int[] randIntArr = randIntsArr(10000);
        //String[] randStringArr = randomStringArr(10000, 5);
        int[][] rand2DArray = random2DIntArray(3,3);

        System.out.println("Unsorted");
        //printIntArr(randIntArr);
        print2DIntArr(rand2DArray);

        long time = System.currentTimeMillis();
        //int median = team1.challengeOne(randIntArr);
        //int median2 = team1.challengeThree(mostlySorted);
        int median3 = team1.challengeFour(rand2DArray);

        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * 0.001 + "Seconds");
        //System.out.println("Median equals: " + median);
        //System.out.println("Median equals: " + median2);
        System.out.println("Median equals: " + median3);

        System.out.println("Sorted");
        //printIntArr(randIntArr);
        print2DIntArr(rand2DArray);

        //int query = team1.challengeTwo(randStringArr, "qwert");
        //System.out.println("Sorted");
        //printStringArr(randStringArr);
        //System.out.println(""+query+"");
    }
}
