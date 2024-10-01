package CH21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01ReaderMain {
    public static void main(String[] args) throws IOException {
        Reader fin = new FileReader("C:\\TMP_IO\\test1.txt");
        //Reader의 반환값은 int다. 그러므로 char로 형변환 필요
        StringBuffer buffer = new StringBuffer();
        int data = 0;
        while ((data = fin.read()) !=-1) {
//            int data = fin.read();
//            if (data == -1) {
//                break;
//            } else {
//            }
//            System.out.print((char) data);
            buffer.append((char) data);
        }
        System.out.println(buffer);
        fin.close(); // 제거작업
    }
}
