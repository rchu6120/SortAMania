public class TestRunner {
    public static String[] randomStringArr(int num,int length) {
        {

        }
        return arr;


    }

    public static int[] randomIntsArr(int length) {
        int [] arr = new int[length];
        for(int w = 0; w < arr.length;w++){
            arr[w] = (int)(Math.random()*100000);
        }
        return arr;
    }

    public static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);

        }
        System.out.println();
    }

    public static void main (String[]args){
        SortCompetition team11 = new Team13SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randomStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team11.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

            }
        }

