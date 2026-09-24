package chat.client;

import java.io.IOException;

public class ClientMain {

    public static final int PORT = 12345;

    static void main() throws IOException {
        Client client = new Client("localhost", 12345);
        client.start();

    }
}
