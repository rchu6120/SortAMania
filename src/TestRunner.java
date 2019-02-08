public class TestRunner {
    public static String[] randomStringArr(int num, int length) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            for (int w = 1; w < num; w++) {
                arr[i] += abc.charAt(((int) (Math.random() * length * 10)));
            }

        }
        return arr;


    }

    public static int[] randomIntsArr(int length) {
        int[] arr = new int[length];
        for (int w = 0; w < arr.length; w++) {
            arr[w] = (int) (Math.random() * 100000);
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortCompetition team11 = new Team13SortCompetition();
        int[] randIntArr = {1,23,2344,56565,86,9,0,45657578,22,1,343,2,563,6655,9244,8566};
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


        /*long time = System.currentTimeMillis();
        int median = team11.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

            }
        }*/

