package Q;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 1; i < 4; i++){
            System.out.println(i + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < 3; j++ ) {
                System.out.println(subjects[j] +"점수:");
                students[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < 4; i++) {
            int total = 0; //단순 변수 선언
            for (int j = 0; j < 3; j++) {
                total += students[i][j]; //total 변수, students 배열 초기화,재선언

            }
            double average = total / 3.0;
            System.out.println(total + "총합" + average + "평균");
        }
    }
}
