package CH22;

import java.io.*;

public class C02CharConvertStreamMain {
    public static void main(String[] args) throws Exception {
        //보조 스트림
        //다른 스트림과 연결이 되어 여러 편리한 기능을 제공
        //단독으로는 사용 불가, 기본 입출력 소스와 함께 사용

        String str = "문자 변환 스트림 사용";

        OutputStream out = new FileOutputStream(("C:\\TMP_IO\\test.txt"));
        OutputStreamWriter wout = new OutputStreamWriter(out);
        BufferedWriter bout = new BufferedWriter(wout);
        bout.write(str);
        bout.flush();
        bout.close();

        InputStream in = new FileInputStream("C:\\TMP_IO\\test.txt");
        BufferedInputStream bin = new BufferedInputStream(in);
        InputStreamReader rin = new InputStreamReader(bin);
        while (true) {
            int data = rin.read();
            if (data == -1) {
                break;
            }
            System.out.println((char)data);
        }
    }
}
