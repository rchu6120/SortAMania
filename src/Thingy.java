public class Thingy implements Comparable<Thingy> {

    private int value;

    public Thingy()
    {
        this.value=(int)(Math.random()*10000);
    }

    public String toString()
    {
        return Integer.toString(this.value);
    }

    public int getValue(){return this.value;}

    @Override
    public int compareTo(Thingy other)
    {
        return this.value-other.value;
    }
}
