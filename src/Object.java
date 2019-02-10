public class Object implements Comparable<Object> {
    private int value;
    public Object(){
        this.value = (int)(Math.random()*10000);
    }

    @Override
    public int compareTo(Object obj){
        return this.value - obj.value;
    }
}
