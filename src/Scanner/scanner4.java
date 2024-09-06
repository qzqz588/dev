package Scanner;

import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("상품의 가격을 입력하세요(-1을 입력하면 종료)");
        int price = scanner.nextInt();
        if (price == -1){
            System.out.println("종료합니다.");
        }else{
        System.out.println("상품의 수량을 입력하세요");
        int Value = scanner.nextInt();

        int total = price * Value;
        System.out.println(total);
    }
}
}
