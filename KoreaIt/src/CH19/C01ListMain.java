package CH19;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
public class C01ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        //추가
        list.add("HTML/CSS/JS");
        list.add("JQUERY");
        list.add("NODEJS");
        list.add("SCSS");
        list.add("REACT");
        list.add("JAVA");
        list.add("JSP/SERVLET");
        list.add("STS");
        list.add("SPRINGBOOT");
        list.add("SPRINGBOOT");
        //조회
        System.out.println("개수 확인 : " + list.size());
        System.out.println("idx로 조회 : " + list.get(2));
        System.out.println("Value로 idx확인 : " + list.indexOf("JAVA"));
        //삭제

        list.remove(0);
        list.remove("JQUERY");
        for (String el : list) {
            System.out.println(el);
            list.clear();
        }
    }
}
