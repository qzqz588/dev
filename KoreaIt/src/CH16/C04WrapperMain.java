package CH16;

public class C04WrapperMain {

    public static void main(String[] args) {
        // Boxing (기본 자료형을 Wrapper 클래스 객체로 변환)
        Integer ob1 = new Integer(100); // 정수 100을 Integer 객체로 생성 (Boxing)
        Integer ob2 = new Integer("100"); // 문자열 "100"을 Integer 객체로 변환
        Integer ob3 = Integer.valueOf("300"); // 문자열 "300"을 Integer 객체로 변환 (valueOf 메서드 사용)

        // ob1, ob2, ob3의 값을 더한 결과 출력 (자동으로 Unboxing이 발생하여 int 값으로 연산)
        System.out.println(ob1 + ob2 + ob3); // 출력: 500

        // UnBoxing (Wrapper 클래스 객체를 기본 자료형으로 변환)
        int n1 = ob1.intValue(); // ob1 객체를 int 값으로 변환
        int n2 = ob2.intValue(); // ob2 객체를 int 값으로 변환
        int n3 = ob3.intValue(); // ob3 객체를 int 값으로 변환

        // n1, n2, n3의 합을 출력
        System.out.println(n1 + n2 + n3); // 출력: 500

        // Auto Boxing (기본 자료형을 자동으로 Wrapper 클래스 객체로 변환)
        Integer ob4 = 100; // 기본형 int 100을 자동으로 Integer 객체로 변환 (Auto Boxing)

        // Auto UnBoxing (Wrapper 클래스 객체가 자동으로 기본 자료형으로 변환되어 연산에 사용됨)
        int n4 = ob1 + ob2 + ob3; // ob1, ob2, ob3가 자동으로 Unboxing되어 int 값으로 더해짐
    }

}