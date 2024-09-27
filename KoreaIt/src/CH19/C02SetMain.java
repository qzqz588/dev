package CH19;

import java.util.*;

public class C02SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        //추가
        set.add("HTML/CSS/JS");
        set.add("JQUERY");
        set.add("NODEJS");
        set.add("SCSS");
        set.add("REACT");
        set.add("JAVA");
        set.add("JSP/SERVLET");
        set.add("STS");
        set.add("SPRINGBOOT");
        set.add("SPRINGBOOT");
        //중복 자료가 있을 경우 뒤에 들어온 값을 받는다.
        //조회
        System.out.println("개수 확인 : " + set.size());
        set.remove("STS");
        System.out.println("개수 확인 : " + set.size());
        //전체조회(Iterator)
//        Iterator<String> iter = set.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        for (String el : set) { //Iterator가 내장 되어 있음
            System.out.println(el);
        set.clear();
        }
    }
}