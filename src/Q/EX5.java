package Q;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 숫자의 갯수를 입력하세요");
        int num = scanner.nextInt();

        int[] numbers = new int[num];
        int minNumber, maxNumber;

        System.out.println(num +" 개의 정수를 입력하세요");
        for (int i = 0; i < num; i++){
        numbers[i] = scanner.nextInt(); //스캐너로 입력받은걸 배열에 저장
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < num; i++) {
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 수 " + minNumber);
        System.out.println("가장 큰 수 " + maxNumber);
    }
}
