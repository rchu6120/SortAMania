public class sortHelper {


    public static int[] randIntArr(int Count) {
        int[] array = new int[Count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Count + 1);
        }
        return array;
    }

    public static String[] randStringArr(int num, int length) {
        String[] array = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            array[num]= s;
        }
        return array;
    }

    public static String printArr(String[] arr) {
        String r= "";
        for(int i=0; i<arr.length; i++) {
            r= r+ "[" + arr[i] + "]";
        }
        return r;
    }


    public static String printIntArr(int[] arr) {
        String r= "";

        for(int num : arr) {
            r=r+""+num;
        }
        return r;
    }


}
