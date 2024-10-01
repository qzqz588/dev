package CH21;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class C08URLStreamMain {
    public static void main(String[] args) throws Exception {
        //URL 객체생성
        URL url = new URL("https://n.news.naver.com/article/374/0000403891?cds=news_media_pc&type=editn");
        //스트림 꺼내기
        InputStream bin = url.openStream();
        //보조스트림
        BufferedInputStream buffIn = new BufferedInputStream(bin); //보조스트림, 버퍼 공간 단위로 수신
        Reader in = new InputStreamReader(buffIn); //보조스트림,byte단위 -> char단위로 변환
        Writer out = new FileWriter("C:\\TMP_IO\\index.html");
        while (true) {
            int data = in.read();
            if (data == -1)
                break;
            System.out.print((char) data);
            out.write((char) data);

        }
        out.flush();
        out.close();
        in.close();
        buffIn.close();
        bin.close();
    }
}
