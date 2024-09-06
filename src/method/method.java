package method;

public class method {
    public static void main(String[] args) {
    printheader(); printfooter(); //매개 변수/ 반환타입이 모두 없음 (void) 사용 이유
    }
    public static void printheader() {
        System.out.println("프로그램을 시작합니다");
        return;
    }

    public static void printfooter(){
        System.out.println("프로그램을 동작합니다.");
        return;
    }
}
