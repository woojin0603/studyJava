package was.v3;

import java.io.IOException;

public class ServerMainV3 {

    private static final int PORT = 12345;

    static void main() throws IOException {
        HttpServerV3 server = new HttpServerV3(PORT);
        server.start();
    }
}
