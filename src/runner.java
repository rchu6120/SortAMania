public class runner {

    public static void main(String[] args) {
        SortCompetition team1 = new Team1SortCompetition();
        int[] randomIntArr = Team1SortCompetition.randIntArr(10000);
        int[][] randomIntArr2 = Team1SortCompetition.randIntArr2(1000);
        String[] randStringArr = Team1SortCompetition.randStringArr(10000, 5);
        Comparable[] randThingyArr=Team1SortCompetition.randThingyArr(10000);
        String str = "abcde";
        Comparable thingy = new Thingy();
        long time;

/*
        System.out . println("Unsorted");
        Team1SortCompetition.printArr(randomIntArr);

         time = System.currentTimeMillis();
        int median = team1.challengeOne(randomIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        Team1SortCompetition.printArr(randomIntArr);





        System.out . println("Unsorted");
        Team1SortCompetition.strprintArr(randStringArr);

         time = System.currentTimeMillis();
        int strPos=team1.challengeTwo(randStringArr,str);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("First index of given string: " + strPos);

        System.out.println("All Sorted!");
        Team1SortCompetition.strprintArr(randStringArr);

*/

/*

        System.out . println("Unsorted");
        Team1SortCompetition.printArr(randomIntArr);

         time = System.currentTimeMillis();
        int median = team1.challengeThree(randomIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Three Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        Team1SortCompetition.printArr(randomIntArr);

*/



/*

        System.out . println("Unsorted");
        Team1SortCompetition.printArr2(randomIntArr2);

        time = System.currentTimeMillis();

        int median=team1.challengeFour(randomIntArr2);

        time = System.currentTimeMillis() - time;

        System.out.println("Challenge Four Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        Team1SortCompetition.printArr2(randomIntArr2);

*/






        System.out . println("Unsorted");
        Team1SortCompetition.thingyprintArr(randThingyArr);

        time = System.currentTimeMillis();
        int thingyPos=team1.challengeFive(randThingyArr,thingy);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Five Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("First index of given Thingy: " + thingyPos);

        System.out.println("All Sorted!");
        Team1SortCompetition.printArr(randomIntArr);


    }

}
