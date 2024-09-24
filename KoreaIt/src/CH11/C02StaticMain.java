package CH11;
class C02Simple{
    int n1;
    static int n2; //객체 생성 전에 생성

    void func1(){
        n1=10;
        n2=20;
    }
    static void func2(){ //스태틱 함수 선언(객체 생성 이전에 만들어짐)
        n2=10;
//        n1=20; //지역변수 n1은 아직 생선되기 전이라 static에는 접근 불가
    }
}
public class C02StaticMain {
    public static void main(String[] args) {

    }
}
