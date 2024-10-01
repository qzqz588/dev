package CH21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05Buffer차이확인 {
    public static void main(String[] args) throws IOException {
        InputStream fin = new FileInputStream("C:\\TMP_IO\\data.exe");
        byte[] buffer = new byte[1024];
        long size = 0;
        long sTime = System.currentTimeMillis();
        while (true) {
            int data = fin.read();
            if(data==-1)
                break;

            size++;
        }
        long eTime = System.currentTimeMillis();
        System.out.println("소요시간 : " + (eTime-sTime) + "ms");
        System.out.println("파일크기 : " + (size*1.0)/(1024*1024)+"MB");
    }
}
