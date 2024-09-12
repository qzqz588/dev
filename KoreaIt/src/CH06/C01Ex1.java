package CH06;

import java.util.Scanner;

public class C01Ex1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("점수를 입력 하쎄용");
//        int num1 = num.nextInt();
//        if(num1%3 == 0 && num1%5==0){
//            System.out.println(num1);
//        int num1 = num.nextInt();
//        int num2 = num.nextInt();
//        if (num1 > num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }
        int 과목1= num.nextInt();
        int 과목2 = num.nextInt();
        int 과목3 = num.nextInt();
        int 과목4 = num.nextInt();
        double 평균 = (double) (과목1 + 과목2 + 과목3 + 과목4)/4;
        System.out.println(평균);
//        int sum = num1+num2+num3;
//        int avg = sum/3;
//        System.out.println("합 : " + sum + "  평균 : " + avg);
//    if(num1 > num2 && num1 > num3){
//        if (num2>num3)
//        System.out.println(num1);
//        System.out.println(num3);
//        } else if (num2>num1 && num2 > num3) {
//        if (num1>num3)
//        System.out.println(num2);
//        System.out.println(num3);
//
//    }else {
//        System.out.println(num3);

    }
}
