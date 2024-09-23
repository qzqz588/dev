package CH09;

import java.util.Scanner;

public class C05StringClassMain {
    public static void main(String[] args) {
        String str1 = "java powerful";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");
        //new = heap이라는 메모리 영역에 공간 생성
        System.out.println("str1 == str2 ? " + (str1==str2));
        System.out.println("str3 == str4 ? " + (str3==str4));
        System.out.println("str1 == str3 ? " + (str1==str3));
        System.out.println("str2 == str4 ? " + (str2==str4));
        System.out.println("=================================================");
        System.out.println("str1 == str2 ? " + (str1.equals(str2)));
        System.out.println("str3 == str4 ? " + (str3.equals(str2)));
        System.out.println("str1 == str3 ? " + (str1.equals(str3)));
        System.out.println("str2 == str4 ? " + (str2.equals(str4)));
        //메모리 주소를 비교하는 식
//        Scanner sc = new Scanner(System.in);
//        String tmp = sc.nextLine();
//        System.out.println(tmp.length());
//        System.out.println(tmp.trim().length());
        System.out.println("문자열 자르기 : " + (str1.substring(2,6)));

        String str6 = "홍길동,남길동,서길동,동길동,길동길동";
        String[] result = str6.split(",");
        for (String val : result) {
            System.out.println(val);
        }
    }
}