package CH13;
class Parent{
    void func1(){
        System.out.println("Parent func1() CALL!");
    }
}
class Son extends Parent{
    void func1(){
        System.out.println("Son Func1 호출!");
    }
    void func2(){
        System.out.println("Son Func2 호출(extends...)!");
    }
}
public class C06UpDownCastingOverridingMain {
    public static void main(String[] args) {
        Parent ob1 = new Parent();
        ob1.func1();

        Son ob2 = new Son();
        ob2.func1();
        Parent ob3 = new Son(); //물려준 메서드지만 하위 메서드의 함수로 재정의하여 사용
        //상위참조변수 = 하위 객체생성
        //ob3.func2();
        ob3.func1();

        //UPCASTING
        //상위클래스형 참조변수 = 하위클래스형 객체
        //자동형변환
        //상속관계에 있는 모든 클래스로 만든 객체를 연결할 수 있다.
        //UPCASTING 상태에서는 확장된(추가된) 멤버함수에 접근 가능? x -> DOWNCASTING
        //UPCASTING 상태에서는 확장된(추가된) 멤버변수에 접근 가능? x -> DOWNCASTING
        //UPCASTING 상태에서는 재정의된 함수에 접근 가능? O
        //
    }
}
