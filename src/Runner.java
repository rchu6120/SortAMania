public class Runner {

    public static void main(String [] args)
    {
        int[] numbers = new int[10000];
        for (int i = 0; i <10000; i++)
        {
            numbers[i]=(int) (Math.random()*10000 +1);
        }
            int a=0;

        //while (a<20)
        //{
            //System.out.println(numbers[a]);
           // a=a+1;
       //}
        System.out.println(Team2SortCompetition.challengeOne(numbers));
    }



}
