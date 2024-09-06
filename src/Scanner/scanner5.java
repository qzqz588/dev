package Scanner;

import java.util.Scanner;

public class scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int count = 0;
        int input = 0;
        System.out.println("숫자를 입력하세요 중단하려면 -1을 입력하세요");
//        while (true) {
//            input = scanner.nextInt();
//            if (input == -1) { //입력값이 -1이면 중지 반복문
//                break;
//            }
        while ((input = scanner.nextInt()) !=-1){
            sum += input;
            count++;
        } //while 문 범위 (해당 범위 내 반복)
        double average = (double) sum / count;
        System.out.println("입력한 숫자의합 : "+ sum);
        System.out.println("입력한 숫자의 평균 : "+ average);

    }

}
