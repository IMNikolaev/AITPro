package bot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        t1.start();
        for (int i = 99; i < 200; i++) {
            System.out.println("Main" + i);
        }
    }
}