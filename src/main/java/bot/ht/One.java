package bot.ht;


public class One {
    public int oneThread (int RANGE_START, int RANGE_END){
        long startTime = System.nanoTime();
        int count = 0;
        for (int i = RANGE_START; i < RANGE_END; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")){
                count++;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time metod One " + (endTime - startTime) / 1000000 + " ms");
        return count;
    }
}
