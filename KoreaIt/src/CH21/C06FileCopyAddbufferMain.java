package CH21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

import static java.lang.System.out;
public class C06FileCopyAddbufferMain {
    private static final String DIR = "C:\\TMP_IO\\";
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream(DIR + args);
        OutputStream out = new FileOutputStream(DIR + args);
        byte[] buffer = new byte[4096];
        long size = 0;
        long sTime = System.currentTimeMillis();
        while (true) {
            int data = in.read();
            if(data==-1)
                break;
            out.write(buffer, 0, data);
            out.flush();

            size++;
        }
        long eTime = System.currentTimeMillis();
        System.out.println("소요시간 : " + (eTime-sTime) + "ms");
//        out.println("파일크기 : " + (size*1.0)/(1024*1024)+"MB");
    }
}

