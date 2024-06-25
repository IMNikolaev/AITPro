package bot.ht;

import java.util.concurrent.atomic.AtomicInteger;

public class MultyThreading {
    public AtomicInteger multyThreading (int RANGE_START, int RANGE_END){
        long startTime = System.nanoTime();
        AtomicInteger totalCount = new AtomicInteger();
        int mid = (RANGE_START + RANGE_END) / 2;

        Thread thread1 = new Thread(() -> {
            for (int i = RANGE_START; i <= mid; i++) {
                if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                    totalCount.incrementAndGet();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = mid + 1; i <= RANGE_END; i++) {
                if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                    totalCount.incrementAndGet();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Time metod Multy " + (endTime - startTime) / 1000000 + " ms");
        return totalCount;
    }
}
