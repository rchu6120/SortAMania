public class Runner {


    public static void main(String[] args) {
        //Creates new instance of SortCompetition
        SortCompetition team7= new Team7SortCompetition();

        //Generates random int and Strings
        int[] randIntArr= sortHelper.randIntArr(10000);
        String[] randStringArr= sortHelper.randStringArr(10000,5);

        //Notifies user that the generated arrays are unsorted and prints out the unsorted arrays
        System.out.println("Unsorted");
        sortHelper.printArr(randIntArr);

        //Prints time of ChallengeOne
        long time= System.currentTimeMillis();
        int median= team7.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);

        //Prints out sorted Int Array
        System.out.println("Sorted");
        sortHelper.printArr(randIntArr);

        //Prints out sorted String Array
        System.out.println("Sorted");
        sortHelper.printStrArr(randStringArr);




    }

}
