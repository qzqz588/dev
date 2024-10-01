package CH21;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

public class C09JsoupMain {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //URL연결
        Connection conn = Jsoup.connect("https://www.op.gg/champions");

        //
        Document document = conn.get();
//        System.out.println(document);

        //IMG태그 받기
        Elements elements = document.getElementsByTag("img");
        System.out.print(elements);
        for (Element el : elements) {
            String img_url = el.getElementsByAttribute("src").attr("src");
            System.out.println(img_url);
            URL url = (new URI("img_url")).toURL();
            InputStream in = url.openStream();
            BufferedInputStream buffin = new BufferedInputStream(in);
            OutputStream out = new FileOutputStream("C:\\TMP_IO\\" + UUID.randomUUID() + ".png");

            byte[] buff = new byte[4096];
            while (true) {
                int data = buffin.read(buff);
                if (data==-1)
                    break;
                out.write(buff, 0, data);
                out.flush();

            }
            out.close();
            buffin.close();
            in.close();
        }
    }
}
