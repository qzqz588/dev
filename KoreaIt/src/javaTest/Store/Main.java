package javaTest.Store;

public class Main {
    public static void main(String[] args) {
//홍길동이 GS감삼편의점에서 콜라 1개를 구매한다
//남길동이 GS감삼편의점에서 콜라 3개를 구매한다
//서길동이 GS동성로편의점에서 콜라 10개를 구매한다
        Buyer 홍길동 = new Buyer(10000, 0);
        Buyer 남길동 = new Buyer(10000, 0);
        Buyer 서길동 = new Buyer(10000, 0);

        Seller GS감삼 = new Seller(3000000, 100, 1000);
        Seller GS동성로 = new Seller(3000000, 100, 1000);
        홍길동.payment(GS감삼,1000);
        서길동.payment(GS감삼,3000);
        남길동.payment(GS동성로,10000);

        System.out.println(홍길동);
        System.out.println(서길동);
        System.out.println(남길동);
        System.out.println(GS감삼);
    }
}
