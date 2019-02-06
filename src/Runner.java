
public class Runner {
    public static void main(String [] args){
        SortCompetition team12 = new Team12SortCompetition();
        int[] randInrArr = Team12SortCompetition.randomIntsArr(10000);
        String [] randStringArr = Team12SortCompetition.randomStringArr(10000,5);

        System.out.println("Unsorted");
        Team12SortCompetition.printArr(randInrArr);

        long time = System.currentTimeMillis();
        int median = team12.challengeOne(randInrArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        Team12SortCompetition.printArr(randInrArr);

        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");


    }
}
