public class Team1SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        mergeSort(arr);
        return findMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        strmergeSort(arr);
        return queryCheck(query, arr);
    }



    @Override
    public int challengeThree(int[] arr)
    {
        insertionSort(arr);
        return findMedian(arr);
    }


    @Override
    public int challengeFour(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=insertionSort(arr[i]);
        }
        int[] med= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            med[i]=findMedian(arr[i]);
        }
        med=insertionSort(med);
        return findMedian(med);
    }



    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        thingybubbleSort(arr);
        return thingyqueryCheck(query,arr);
    }

    @Override
    public String greeting() {
        return "Hello, we are team 1!";
    }













    public static void printArr(int[] arr)
    {
        for(int x =0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }

   public static void printArr2(int[][] arr)
    {
        for(int x =0;x<arr.length;x++)
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[x][i]+" ");
            }

        }
        System.out.println();
    }

    public static void strprintArr(String[] arr)
    {
        for(int x =0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }


    public static void thingyprintArr(Comparable[] arr)
    {
        for(int x =0;x<arr.length;x++)
        {
            System.out.print(arr[x].toString() +" ");
        }
        System.out.println();
    }






    public static int[] randIntArr(int count)
    {
        int[] arr= new int[count];
        for(int x=0;x<count;x++)
        {
            arr[x]=(int)(Math.random()*10001);
        }
        return arr;
    }


    public static int[][] randIntArr2(int count)
    {
        int[][] arr= new int[count][count];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10001);
            }
        }
        return arr;
    }




    public static String[] randStringArr(int num,int length)
    {
        String[] arr= new String[num];
        while (num>0)
        {
            int i =0;
            String s ="";
            while (i< length)
            {
                char c =(char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;

        }
        return arr;
    }

    public static Comparable[] randThingyArr(int count)
    {
        Comparable[] things = new Comparable[count];
        for (int x=0;x<count;x++)
        {
            things[x]=new Thingy();
        }
        return things;
    }






    private static Comparable[] thingybubbleSort(Comparable[] arr)
    {
        int pos;
        int swapcount;
        boolean done = false;
        while(!done)
        {
            swapcount=0;
            pos=0;
            int lastswap=arr.length-1;
            for(int x=0;x<lastswap;x++)
            {
                if((arr[pos]).compareTo(arr[pos+1])>0)
                {
                    thingyswap(arr,pos,pos+1);
                    swapcount++;
                    lastswap=pos+1;
                }
                pos++;
            }
            if (swapcount==0)
            {
                done=true;
            }
        }
        return arr;
    }




    private static void thingyswap(Comparable[] arr,int i, int j)
    {
        Comparable temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }









    public static void intswap(int[] arr,int i, int j)
    {
        int temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static int[]insertionSort(int[] arr)
    {
        for(int x=1;x<arr.length;x++)
        {
            int pos=x;
            while((pos>0)&&(arr[pos]<arr[pos-1]))
            {
                intswap(arr,pos,pos-1);
                pos--;
            }
        }
        return arr;
    }


    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }



    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }



    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }








    public static int queryCheck(String str, String[] arr) {

        int fin = -1;

        for (int x = 0; x < arr.length; x++) {
            if ((arr[x].equals(str))) {
                if (fin == -1) {
                    fin = x;
                }
            }
        }
        return fin;
    }


    public static int thingyqueryCheck(Comparable thingy, Comparable[] arr) {

        int fin = -1;

        for (int x = 0; x < arr.length; x++) {
            if ((arr[x].compareTo(thingy))==0) {
                if (fin == -1) {
                    fin = x;
                }
            }
        }
        return fin;
    }





    public static void strmergeSort(String[] elements) {
        int n = elements.length;
        String[] temp = new String[n];
        strmergeSortHelper(elements, 0, n - 1, temp);
    }



    private static void strmergeSortHelper(String[] elements,
                                           int from, int to, String[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            strmergeSortHelper(elements, from, middle, temp);
            strmergeSortHelper(elements, middle + 1, to, temp);
            strmerge(elements, from, middle, to, temp);
        }
    }



    private static void strmerge(String[] elements,
                                 int from, int mid, int to, String[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i].compareTo( elements[j])<0)
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }






    public static void strswap(String[] arr,int i, int j)
    {
        String temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }














    public static int findMedian(int[] arr)
    {
        int med;
        if(arr.length%2==0)
        {
            med=(arr[arr.length/2]+arr[arr.length/2+1])/2; //rounding down//
        }
        else
        {
            med=(arr[arr.length/2]);
        }
        return med;
    }




}
