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
    public int challengeFour(int[][] arr)
    {
        for(int i = 0; i< arr.length;i++)
        {
            Sorting_Algorithims.mergeSort(arr[i]);
        }
        Sorting_Algorithims.doubleMergeSort(arr);
        int median = (((arr[500][499]+arr[500][500])/2)+((arr[499][499]+arr[499][500])/2))/2;
        return median;
    }
    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        int re=-1;
        Sorting_Algorithims.objMergeSort(arr);
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] == query)
            {
                re = i;
                return i;
            }
        }
        return re;
    }

    @Override
    public String greeting() {
        return "Welcome to Camp Crystal Lake";
    }
}
