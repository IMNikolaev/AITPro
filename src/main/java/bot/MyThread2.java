package bot;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1000; i < 1100; i++) {
            System.out.println("Runnable" + i);
        }
    }
}
