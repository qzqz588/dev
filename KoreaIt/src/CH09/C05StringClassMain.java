package CH09;

public class C05StringClassMain {
    public static void main(String[] args) {
        String str1 = "java";
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
    }
}