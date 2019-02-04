
public class Team13SortCompetition extends SortCompetition
{
    @Override
    public int challengeOne(int[] arr)
    {
        Sorting_Algorithims.mergeSort(arr);
        int median = arr[5000];
        return median;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
        //selection sort for strings
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }
    //Insertion sort for the win.
    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }
    //sort with merge
    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "Welcome to Camp Crystal Lake";
    }
}
