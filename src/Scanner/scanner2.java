package Scanner;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int num3 = num1 + num2;
        System.out.println("두 수의 합 = " + num3);
    }
}
