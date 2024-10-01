package CH22;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class C01InputStreamReaderMain {
    public static void main(String[] args) throws IOException {
        OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.exe");
        fout.write("홍길동".getBytes(StandardCharsets.UTF_8));
        fout.write('b');
        fout.write('c');
        fout.write('d');
        fout.flush();
        fout.close();

        //
        InputStream fin = new FileInputStream("C:\\TMP_IO\\test.exe");
        InputStreamReader subIn = new InputStreamReader(fin);

        while (true) {
            int data = subIn.read();
            if(data==-1)
                break;
            System.out.print((char)data);
        }
    }
}
