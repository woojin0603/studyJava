package thread.cas.increment;

public class IncrementPerformanceMain {

    public static final long COUNT = 100_000_000;

    static void main() {
        test(new BasicInteger());   // 캐시를 적극적으로 활용하기 때문에 가장 빠른 성능(단일 스레드 사용 시 최적)
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) {
        long startMs = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }
        long endMs = System.currentTimeMillis();

        System.out.println(incrementInteger.getClass().getSimpleName() + ": ms=" + (endMs - startMs));

    }

}
