package CH24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {
    public static void main(String[] args) throws IOException {

        Socket server = new Socket("192.168.5.50",9002);

        DataInputStream din = new DataInputStream(server.getInputStream());
        DataOutputStream dout = new DataOutputStream(server.getOutputStream());

        Scanner sc = new Scanner(System.in);
        String send = null;
        String recv = null;

        while (true) {
            //송신
            System.out.println("ME(q:종료)] ");
            send = sc.nextLine();
            dout.writeUTF(send);
            dout.flush();
            if (send.equals("q")) {
                break;
            }
            //수신
            recv = din.readUTF();
            if (recv == null || recv.equals("q")) {
                break;
            }
        }
        System.out.println("[SERVER] : "+recv);
    }
}
