package was.v4;

import java.io.IOException;

public class ServerMainV4 {

    private static final int PORT = 12345;

    static void main() throws IOException {
        HttpServerV4 server = new HttpServerV4(PORT);
        server.start();
    }
}
