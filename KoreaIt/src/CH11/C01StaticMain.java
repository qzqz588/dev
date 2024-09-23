package CH11;
class C01Simple{
    static int num1; //공유 메모리 영역(클래스,매서드영역)에 할당
                    //객체 생성과는 무관하게 사용가능(클래스명.static 변수명)
    int num2;

    C01Simple(){
        this.num1=0;
        this.num2=0;
    }

    @Override
    public String toString() {
        return "C01Simple{" +
                "num2=" + num2 +
                '}';
    }
}


public class C01StaticMain {
    public static void main(String[] args) {
        C01Simple ob1 = new C01Simple();
        C01Simple ob2 = new C01Simple();
//        C01Simple.num1=100;
        ob1.num1=123;
        System.out.println(C01Simple.num1);
        System.out.println(ob1.num1);
        System.out.println(ob2.num1);
    }
}
