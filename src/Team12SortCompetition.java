public class Team12SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        return 0;
        }

        @Override
        public int challengeTwo (String[]arr, String query){
            return 0;
        }

        @Override
        public int challengeThree ( int[] arr){
            return 0;
        }

        @Override
        public int challengeFour ( int[][] arr){
            return 0;
        }

        @Override
        public int challengeFive (Comparable[]arr, Comparable query){
            return 0;
        }

        @Override
        public String greeting () {
            return "Hello! We are team 12 :)";
        }
        public static void merge(int[] elements, int from, int mid, int to, int[] temp){
            int i = from;
            int j = mid + 1;
            int k = from;
            while (i <= mid && j <= to){
                if (elements[i] < elements[j]){
                    temp[k] = elements[i];
                    i++;
                }
                else{
                    temp[k] = elements[j];
                    j++;
                }
                k++;
            }
            while (i <= mid){
                temp[k] = elements[i];
                i++;
                k++;
            }
            while (j <= to){
                temp[k] = elements[j];
                j++;
                k++;
            }
            for (k = from; k <= to; k++){
                elements[k] = temp[k];
            }
        }
        public void mergeSortHelper(int[] arr, int left, int right, int[] temp){
            if (left < right){
                int mid = (left+right)/2;
                mergeSortHelper(arr,left, mid,temp);
                mergeSortHelper(arr,mid+1,right,temp);
                merge(arr, left, mid, right, temp);
            }
        }
        public void mergeSort(int[] arr){
            int n = arr.length;
            int[] temp = new int[n];
            mergeSortHelper(arr,0,n-1,temp);
        }

    //makes an array of 1000 random integers
    public static int[] randIntArr ( int count) {
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = (int) (Math.random() * 10001);
        }
        return num;  //check this return statement again
    }
    public static int getMedian(int [] arr)
        {
        // to find the median
        int middle = arr.length / 2;
        int median = 0; //declare variable
        if (arr.length % 2 == 1)
            median = (int)arr[middle];
        else
            median = (int)(arr[middle - 1] + arr[middle]) / 2;
        return median;
    }

    }

