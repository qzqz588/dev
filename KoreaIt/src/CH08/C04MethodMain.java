package CH08;

import java.util.Scanner;

class MethodTest{
    //속성
    Scanner sc = new Scanner(System.in);
    //기능
    public int sum1(int n1,int n2){return n1+n2;}
    public int sum2(){return sc.nextInt() + sc.nextInt();}
    public void sum3(int n1,int n2 ){
        System.out.println(sc.nextInt() + sc.nextInt());
//        public void sum4() {
            System.out.println(sc.nextInt() + sc.nextInt());

    }
}
public class C04MethodMain {
    public static void main(String[] args) {
        MethodTest sumcal = new MethodTest();
        System.out.println(sumcal.sum1(10, 20));
        System.out.println(sumcal.sum2());
        sumcal.sum3(10, 20);
//        sumcal.sum4();
    }
}
