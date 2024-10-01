package CH21;
import java.io.*;
public class C04FileOutputStreamMain {
    public static void main(String[] args) throws Exception {
        OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.txt");
        fout.write('가');
        fout.write('b');
        fout.write('c');
        fout.flush();
        fout.close();
    }
}
