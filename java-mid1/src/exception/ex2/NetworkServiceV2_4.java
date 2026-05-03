package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        // 하나의 try 안에 정상 흐름을 모두 담기
        try {
            client.connect();
            client.send(data);
            client.disconnect();
            // 예외 흐름들은 catch 블럭으로 몰아 넣기
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }

        client.disconnect();
    }
}
