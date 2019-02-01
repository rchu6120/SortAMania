public class sortHelper {


    public static int[] randIntArr(int Count) {
        int[] array= new int[Count];
        for(int i=0; i<array.length; i++){
            array[i]= (int)(Math.random()*Count +1);
        }
        return array;
    }


}
