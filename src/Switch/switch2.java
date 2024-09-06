package Switch;

public class switch2 {
    public static void main(String[] args) {
        int grade = 0;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("할인 받은 금액" + coupon);
    }
}
