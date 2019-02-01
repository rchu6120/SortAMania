public class Team2SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Hello, we are Team 2 but we'll be #1";
    }

    public void mergeSortHelper (int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1, right, temp);
            merge(arr,left,mid,right,temp);
        }
    }

}
