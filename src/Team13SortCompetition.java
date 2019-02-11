public class Team13SortCompetition extends SortCompetition
{
    @Override
    public int challengeOne(int[] arr)
    {
        Sorting_Algorithims.mergeSort(arr);
        int front = arr.length/2;
        int back = arr.length -1;
        int median = 0;
        if(arr.length%2 ==0) {
            median = (arr[front] + arr[back]) / 2;
        }
        else
            median = arr[front];
        return median;
    }
    @Override
    public int challengeTwo(String[] arr, String query) {
            Sorting_Algorithims.selectionSort(arr);

        return Sorting_Algorithims.indexOfArrayOfStrings(arr,query);
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
                return re;
            }
        }
        return re;
    }

    @Override
    public String greeting() {
        return "Welcome to Camp Crystal Lake";
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
}
