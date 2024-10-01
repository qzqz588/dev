package CH16;

// 클래스 A 정의
class A {
    // 인스턴스 변수 x와 y 초기화
    int x = 10;
    int y = 20;

    // toString() 메서드 오버라이드: 객체의 문자열 표현을 반환
    @Override
    public String toString() {
        return "X=" + x + " Y=" + y; // x와 y의 값을 문자열로 반환
    }
}

// C01ObjectMain 클래스 정의
public class C01ObjectMain {

    // 프로그램 실행의 시작점인 main 메서드
    public static void main(String[] args) {
        // Object 클래스의 인스턴스 ob1 생성
        Object ob1 = new Object();

        // ob1 객체의 기본 toString() 메서드 호출 및 출력
        System.out.println(ob1); // ob1의 메모리 주소가 출력됨
        System.out.println(ob1.toString()); // ob1의 메모리 주소가 출력됨

        // 클래스 A의 인스턴스 ob2 생성
        A ob2 = new A();

        // ob2 객체의 toString() 메서드 호출 및 출력
        System.out.println(ob2); // A 클래스에서 오버라이드한 toString() 호출
        System.out.println(ob2.toString()); // A 클래스에서 오버라이드한 toString() 호출
    }
}