public class Comparabl implements Comparable<Comparabl>
{
        private int value;
        public Comparabl()
        {
            this.value = (int)(Math.random()*10000);
        }
        @Override
        public int compareTo(Comparabl o)
        {
            return this.value-o.value;
        }

}
