public class Runner {
    public static int[] randomIntsArr(int length){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr [i] = (int)(Math.random() *10000 +1);
        }
        return arr;
    }
    //hehe

    public static String[] randomStringArr(int num, int length)
    {
        String[] arr= new String [num];
        while (num>0)
        {
            int i=0;
            String s="";
            while (i<length)
            {
                char c= (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }

    public static void main (String[] args) {
        SortCompetition team2 = new Team2SortCompetition();
        int[] randomIntsArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randStringArr);

        long time = System.currentTimeMillis();
        int median = team2.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}
