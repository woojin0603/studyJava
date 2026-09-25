package was.v2;

import java.io.IOException;

public class ServerMainV2 {

    private static final int PORT = 12345;

    static void main() throws IOException {
        HttpServerV2 server = new HttpServerV2(PORT);
        server.start();
    }
}
