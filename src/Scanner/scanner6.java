package Scanner;

import java.util.Scanner;

public class scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("1. 상품입력 2. 결제 3. 프로그램종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine(); //개행문자 제거

                System.out.println("상품명을 입력하세요");
                String product = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요");
                int price = scanner.nextInt();

                System.out.println("상품 수량을 입력하세요");
                int quantity = scanner.nextInt();

                total += price * quantity;
                System.out.println("상품명" + product + "가격" + price + "수량" + "합계" + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용" + total);
                total = 0; //결제 후 비용 초기화

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 값을 입력해 주세요");
            }
        }
    }
}