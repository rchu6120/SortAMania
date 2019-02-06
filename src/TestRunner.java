public class TestRunner
{
    public static void main(String[] args) {
        SortCompetition team11 = new Team13SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randomStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team11.challengeOne(randIntArr);\


        gf

    }
}
