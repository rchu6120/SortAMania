public class Comparable implements Comparable<Comparable>
{
        private int value;
        public Comparable()
        {
            this.value = (int)(Math.random()*10000);
        }
        @Override
        public int compareTo(Comparable o) {
            return this.value-o.value;
        }

}
