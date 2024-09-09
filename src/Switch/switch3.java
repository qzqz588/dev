package Switch;

public class switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> throw new IllegalStateException("Unexpected value: " + grade);
        };
        System.out.println("발급 받은 쿠폰 "+ coupon);
    }
}
