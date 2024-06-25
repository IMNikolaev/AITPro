package bot.ht;

public class MainHT {
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 2_000_000;

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.oneThread(RANGE_START, RANGE_END));
        MultyThreading mt = new MultyThreading();
        System.out.println(mt.multyThreading(RANGE_START, RANGE_END));
    }
}
