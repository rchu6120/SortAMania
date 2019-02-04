public class Team7SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
    }

    public int challengeTwo(String[] arr, String query) {
        String[] arr1 = new String[];
        public challengeTwo(String[] arr1){
            this.arr1 = arr1;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (charArray[j] < charArray[i]) {
                    char temp = charArray[i];
                    charArray[i] = arr[j];
                    charArray[j] = temp;
                }
            }
        }
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