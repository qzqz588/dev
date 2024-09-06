package Q;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");
        int[] numbers = new int[5];
        double avg;
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        avg =(double) total / numbers.length;
        System.out.println("정수의 총 합 = " + total);
        System.out.println("정수의 평균 값 = " + avg);

    }
}
