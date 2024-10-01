package CH21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02WriterMain {
    public static void main(String[] args) throws IOException {
//        Writer fout = new FileWriter("C:\\TMP_IO\\test1.txt",false); //덮어쓰기 / 기본값
        Writer fout = new FileWriter("C:\\TMP_IO\\test1.txt",true); //다음 줄에 내용 추가하기
        fout.write("HelloWorld\n");
//        fout.write("TEST2\n");
//        fout.write("TEST3\n");
        fout.flush();
        fout.close();
    }
}
