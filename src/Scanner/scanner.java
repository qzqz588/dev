package Scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);
    }
}
