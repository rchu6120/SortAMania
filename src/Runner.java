public class Runner {


    public static void main(String[] args) {
        //Creates new instance of SortCompetition
        SortCompetition team7= new Team7SortCompetition();

        //Generates random int and Strings
        int[] challengeOne= Team7SortCompetition.randIntArr(10000);
        String[] randStringArr= Team7SortCompetition.randStringArr(10000,5);

        //Notifies user that the generated arrays are unsorted and prints out the unsorted arrays
        System.out.println(Team7SortCompetition.printArr(challengeOne));


        //Prints time of ChallengeOne
        long time= System.currentTimeMillis();
        int median= team7.challengeOne(challengeOne);

        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        //Prints out sorted Int Array
        System.out.println(Team7SortCompetition.printArr(challengeOne));
        System.out.println("this is sorted");







    }

}
