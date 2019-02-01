public class sortAManiaTestRunner extends Team8SortCompetition {

    SortCompetition team1 = new Team8SortCompetition();
    int[] randIntArr = randIntsArr(10000);
    String[] randStringArr = randomStringArr(10000, 5);

    System.out.println("Unsorted");
    printIntArr(randIntArr);

    long time = System.currentTimeMillis();
    int median = team1.challengeOne(randIntArr);
    time = System.currentTimeMillis() - time;
    System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
    System.out.println("Median equals: " + median);

    System.out.println("Sorted");
    printIntArr(randIntArr);

}
