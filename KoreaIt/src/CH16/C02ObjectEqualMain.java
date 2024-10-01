package CH16;

// C02Simple 클래스 정의
class C02Simple {
    int n; // 인스턴스 변수 n 선언

    // 생성자: 객체 생성 시 인스턴스 변수 n을 초기화
    C02Simple(int n) {
        this.n = n;
    }

    // equals 메서드를 오버라이드하여 두 객체가 동일한지 비교
    @Override
    public boolean equals(Object obj) {
        // obj가 C02Simple 타입의 객체인지 확인
        if (obj instanceof C02Simple) {
            // obj를 C02Simple로 다운캐스팅
            C02Simple down = (C02Simple) obj;
            // 현재 객체와 obj 객체의 n 값이 같은지 비교
            return this.n == down.n;
        }
        // obj가 C02Simple 타입이 아니면 false 반환
        return false;
    }
}

// B 클래스 정의 (내용이 없는 빈 클래스)
class B {

}

// C02ObjectEqualMain 클래스 정의
public class C02ObjectEqualMain {

    // 프로그램 실행의 시작점인 main 메서드
    public static void main(String[] args) {

        // C02Simple 객체 ob1을 생성하고 n 값을 10으로 초기화
        C02Simple ob1 = new C02Simple(10);
        // C02Simple 객체 ob2를 생성하고 n 값을 20으로 초기화
        C02Simple ob2 = new C02Simple(20);
        // C02Simple 객체 ob3를 생성하고 n 값을 10으로 초기화
        C02Simple ob3 = new C02Simple(10);

        // ob1과 ob2의 n 값이 같은지 비교 (n 값이 다르므로 false)
        System.out.println(ob1.equals(ob2)); // 출력: false
        // ob1과 ob3의 n 값이 같은지 비교 (n 값이 같으므로 true)
        System.out.println(ob1.equals(ob3)); // 출력: true
    }
}
