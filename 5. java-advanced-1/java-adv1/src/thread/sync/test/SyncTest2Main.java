package thread.sync.test;

import static util.MyLogger.log;

public class SyncTest2Main {

    static void main() {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class MyCounter {

        public void count() {
            // 지역 변수는 개별 공간인 스택 영역에 생성되기 때문에 동시성 문제를 고려하지 않아도 된다.
            int localValue = 0;
            for (int i = 0; i < 1000; i++) {
                localValue = localValue + 1;
            }
            log("결과 : " + localValue);
        }
    }

}
