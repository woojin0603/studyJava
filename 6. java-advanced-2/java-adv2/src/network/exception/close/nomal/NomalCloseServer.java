package network.exception.close.nomal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class NomalCloseServer {

    static void main() throws InterruptedException, IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        log("소캣 연결: " + socket);

        Thread.sleep(1000);
        socket.close();
        log("소캣 종료");
    }
}
