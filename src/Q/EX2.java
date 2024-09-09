package Q;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요"); //사용자 입력
        int[] numbers = new int[5]; //입력한 정수로 배열 선언

        for (int i = 0; i < 5; i++) { //배열에 저장한 값을 i로 지정,5개 정수기에 5번 반복
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");

            }
        }
    }
}

