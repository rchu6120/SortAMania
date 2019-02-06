public class Team7SortCompetition extends SortCompetition {


    public int challengeOne(int[] arr) {
       int start=0, end=0;

    }

    public int challengeTwo(String[] arr, String query) {
        for (int i = 0; i<arr.length; i++){
            if(arr[i].indexOf(query) > 0){
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        return 0;
    }

    public int challengeFour(int[][] arr) {
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    public String greeting() {
        return "Hi Mr. Levin! We're Team 7 and we're going to win this FREAKING COMPETITION!";
    }
}
////