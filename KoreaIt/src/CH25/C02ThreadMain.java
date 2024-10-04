package CH25;

public class C02ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //Runnable Interface 이용한 스레드 분할

        //01 작업 스레드 객체 생성
        C02Worker1 w1 = new C02Worker1();
        C02Worker2 w2 = new C02Worker2();

        //02
        Thread th1 = new Thread(w1);
        Thread th2 = new Thread(w2);

        //03
        th1.start();
        th2.start();

        //04
        for (int i = 0; i < 10; i++) {
            System.out.println("MAIN THREAD..");
            Thread.sleep(500);
        }
    }
}
