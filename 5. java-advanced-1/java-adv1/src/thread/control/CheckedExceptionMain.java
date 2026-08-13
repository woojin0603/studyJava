package thread.control;

public class CheckedExceptionMain {

    static void main() throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /*throws Exception*/ {
            /*throw new Exception();*/
        }
    }

}
