package network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class ClientV1 {

    public static final int PORT = 12345;

    static void main() throws IOException {
        log("클라이언트 시작");
        Socket socket = new Socket("localhost", PORT);

//        socket.getOutputStream();   // 외부에 데이터를 보낼 때
//        socket.getInputStream();    // 외부의 데이터를 받을 때

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소캣 연결: " + socket);

        // 서버에게 문자 보내기
        String toSend = "Hello";
        output.writeUTF(toSend);
        log("client -> server: " + toSend);

        // 서버로부터 문자 받기
        String received = input.readUTF();
        log("client <- server: " + received);

        // 자원 정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
    }
}
