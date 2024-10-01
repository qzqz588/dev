package CH22;

import java.io.*;

public class C03PrintWirterMain {
    public static void main(String[] args) throws Exception{
        Writer out = new FileWriter("C:\\TMP_IO\\test2.txt");
        BufferedWriter bout = new BufferedWriter(out);
        PrintWriter pout = new PrintWriter(bout);
        pout.println("HELLO");
        pout.println("HELLO");
        pout.println("HELLO");
        pout.flush();
        pout.close();
        //
        Reader in = new FileReader("C:\\TMP_IO\\test2.txt");
        BufferedReader bin = new BufferedReader(in);

        while (true) {
            String data = bin.readLine(); //개행을 기준으로 읽음
            if(data==null)
                break;
            System.out.println(data);
        }
    }
}
