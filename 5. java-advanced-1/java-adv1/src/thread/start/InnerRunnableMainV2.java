package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {

    static void main() {
        log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

}
