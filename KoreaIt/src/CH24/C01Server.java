package CH24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
    public static void main(String[] args) throws IOException {
        //서버 소켓 생성
        ServerSocket server = new ServerSocket(7000);
        System.out.println("[INFO] SERVER SOCKET LISTENING");

        while(true) {
            Socket clinet = server.accept(); //클라이언트 요청 시 허가하는 객체
            System.out.println("[INFO] SERVER ACCEPTED...CLINET IP : " + clinet.getInetAddress());
            OutputStream out = clinet.getOutputStream();
            DataOutputStream dout = new DataOutputStream(out);
            dout.writeUTF("김병관 알페스 오늘 집에가서 그려야지");
            dout.close();
            out.close();
            clinet.close();
        }

//        server.close();

    }
}
