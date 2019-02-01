public class Team8SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        int length = arr.length;

        for (int gap = length/2; gap > 0; gap/= 2) {
            for (int i = gap; i < length; i++) {
                int temp = arr[i];

                for (int j = i; j >= gap && arr[j - gap] > temp; j-= gap) {
                    arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
        }

        //find median value and return it
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
        return null;
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

    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to) {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }

    public int[] randIntsArr(int count) {
        int[] list= new int[count];
        for (int i=0; i<list.length; i++)
        {
            list[i]=(int) (Math.random() *10001);
        }
        return list;
    }

    public String[] randomStringArr(int count, int length) {
        String[] arr = new String[count];

        while (count > 0) {
            int i = 0;
            String s = "";

            while(i < length) {
                char c = (char)((Math.random()*26) + 97);
                s = s + c;
                i++;
            }

            count--;
            arr[count] = s;
        }

        return arr;
    }

    public static void printIntArr(int [] arr) {
        //prints array
    }
}

