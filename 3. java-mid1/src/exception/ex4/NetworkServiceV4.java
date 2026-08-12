package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        // 하나의 try 안에 정상 흐름을 모두 담기
        try {
            client.connect();
            client.send(data);

        } finally {
            client.disconnect();
        }
    }
}
