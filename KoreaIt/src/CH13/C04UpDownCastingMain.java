package CH13;
//upcast
//부모 클래스형의 참조변수 = 자식클래스의 객체
//부모 클래스형의 참조변수를 통해서는 부모 클래스의 속성에만 접근가능
//암시적이라 형변환이 보이지 않음
//상위클래스 참조변수에 하위 객체가 연결되는 경우 Upcasting


class Super{
    int n1;
}
class Sub extends Super{
    int n2;
}

public class C04UpDownCastingMain {
    public static void main(String[] args) {
        //NoCasting
        Super ob1 = new Super();
        ob1.n1 = 100;
        Sub ob2 = new Sub();
        ob2.n1 = 100;
        ob2.n2 = 200;

        //
        //UpCasting(상위클래스형 참조변수 = 하위 클래스의 객체),자동형변환
        Super ob3 = new Sub();
        ob3.n1=100;
        //
//        ob3.n2=200;
        Super ob4 = ob2;

        //DownCasting : (하위클래스형 참조변수 = 상위클래스형 객체), 강제형변환
        //Upcasting을 전제로 확장된(추가된)멤버에 접근하기 위해 사용
        //Sub ob5 = (Sub)new Super();

        Sub down= (Sub)ob3;
        down.n1=10;
        down.n2=20;
    }
}
