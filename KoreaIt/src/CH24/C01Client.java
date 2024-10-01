package CH24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Locale;

public class C01Client {
    public static void main(String[] args) throws IOException {

        Socket server = new Socket("192.168.5.50",7000);
        InputStream in = server.getInputStream();
        DataInputStream din = new DataInputStream(in);
        String recv = din.readUTF();
        System.out.println("?" + recv);
        din.close();
        server.close();
        in.close();
    }
}
