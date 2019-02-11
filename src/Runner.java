public class Runner {


    public static void main(String[] args) {
        //Creates new instance of SortCompetition
        SortCompetition team7= new Team7SortCompetition();

        //Generates random int and Strings

        int[] randIntArr1= Team7SortCompetition.randIntArr(10000);
        String[] randStringArr2= Team7SortCompetition.randStringArr(10000,5);

        //Notifies user that the generated arrays are unsorted and prints out the unsorted arrays
        System.out.println(Team7SortCompetition.printArr(randIntArr1));

        int[] challengeOne= Team7SortCompetition.randIntArr(10000);
        String[] challengeTwo= Team7SortCompetition.randStringArr(10000,3);
        //Comparable[] challengeFive = Team7SortCompetition(1200,5);


        //Notifies user that the generated arrays are unsorted and prints out the unsorted arrays
       // System.out.println(Team7SortCompetition.printStrArr(challengeTwo);



        //Prints time of ChallengeOne
        long time= System.currentTimeMillis();
        int median= team7.challengeOne(randIntArr1);

        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);


        //Prints out sorted Int Array
        System.out.println(Team7SortCompetition.printArr(randIntArr1));
        System.out.println("this is sorted");

        //Prints out sorted Int Array (ChallengeOne)
        System.out.println(Team7SortCompetition.printArr(challengeOne));
        System.out.println("Sorted");

        //Prints time of challengeTwo
        long time2= System.currentTimeMillis();
        int query= team7.challengeTwo(challengeTwo,"aae");
        //Prints out sorted String Array (ChallengeTwo)
        System.out.println(Team7SortCompetition.printStrArr(challengeTwo));
        System.out.println("Sorted");
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Index of query equals: " + query);

        //Challenge Four
        long time4= System.currentTimeMillis();
        System.out.println(Team7SortCompetition.printStrArr(challengeTwo));
        System.out.println("Sorted");
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Three Time Taken: " + time4 * 0.001 + " Seconds");
        System.out.println("Index of query equals: " + query);

    }

}
