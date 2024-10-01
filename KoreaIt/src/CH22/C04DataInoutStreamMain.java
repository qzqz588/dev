package CH22;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class C04DataInoutStreamMain {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\TMP_IO\\test3.txt");
        DataInputStream din = new DataInputStream(in);
        String name = din.readUTF();
        System.out.println(name);
        double weight = din.readDouble();
        System.out.println(weight);
        int data = din.readInt();
        System.out.println(data);
    }
}
