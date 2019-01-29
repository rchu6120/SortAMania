public class sortAMANIATestRunner {

    SortCompetition team1 = new Team1SortCompetition();
    int[] randIntArr = randomIntsArr(10000);
    String[] randStringArr = randomStringArr(10000,5);

    System.out.println("Unsorted");
    printArr(randIntArr);

    long time = System.currentTimeMills();
    int median = team1.challengeOne(randIntArr);
    time = System.currentTimeMills() - time;
    System.out.prinjtln("")
}
