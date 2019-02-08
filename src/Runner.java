
public class Runner {
    public static void main(String [] args){
        SortCompetition team12 = new Team12SortCompetition();
        int[] randIntArr = Team12SortCompetition.randomIntsArr(10000);
        String [] randStringArr = Team12SortCompetition.randomStringArr(10000,5);
            //CHALLENGE 1
        System.out.println("Unsorted");
        Team12SortCompetition.printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team12.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        Team12SortCompetition.printArr(randIntArr);

        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           //CHALLENGE 2
        System.out.println("Unsorted");
        Team12SortCompetition.printArr(randStringArr);

        long time2 = System.currentTimeMillis();
        int indexOfQuery = team12.challengeTwo(randStringArr,"query");
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Index equals: " + indexOfQuery);

        System.out.println("Sorted");
        Team12SortCompetition.printArr(randStringArr);

        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            //CHALLENGE 3
        int[] randIntArr2 = Team12SortCompetition.randomIntsArr(100000);
        System.out.println("Unsorted");
        Team12SortCompetition.printArr(randIntArr);

        long time3 = System.currentTimeMillis();
        int median3 = team12.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        Team12SortCompetition.printArr(randIntArr);

        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            //CHALLENGE 4
        System.out.println("Unsorted");
        Team12SortCompetition.printArr(randIntArr);

        long time4 = System.currentTimeMillis();
        int median4 = team12.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        Team12SortCompetition.printArr(randIntArr);

        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        //CHALLENGE 5



    }
}
