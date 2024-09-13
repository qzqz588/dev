package CH07;

public class C01 {
    public static void main(String[] args) {
        //01 while 기본
        //while(조건식{
        //조건식이 참인 경우 실행되는 종속 문장(1개의 행일때는 생략가능)

        //탈출용 변수
        //탈출을 위한 조건식
        //탈출을 위한 연산식
//        int i = 0;
//        while (i<5) {
//            System.out.println("HelloWorld");
//            i++;
//            break;
//        int i = 1;
//        int sum= 0;
//
//        while (i < 10) {
//            System.out.println("i : " + i);
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);

        //1 - n 까지의 합
        // N - M 까지의 합
        // 1 - N 가지 수중에 짝수/홀수 합을 각각 출력
        // 1 - N 까지 수중에 3의 배수만 출력하고 그 합도 출력
        // 1 - N 까지 수중에 4의 배수만 출력하고 4의 배수가 아닌 나머지의 합
        //구구단 2 단 출력
        //구구단 N 단 출력
//        int i = 1;
//        int n = 0;
//        int sum = 0;
//        while(i<n){
//            sum += i;
//        }
//        System.out.println(sum);
//        int n = 1;
//        int m = 5;
//        int sum = 0;
//        while (n<m){
//            sum += n;
//            n++;
//        }
//        System.out.println(sum);
        //김병관 왔다 감. 반갑습니다.
        int i = 2;
        int n = 0;
        int sumdev = 0;
        int sumdou = 0;
//        while (i<=n){
//            if (i%2==0){
//                sumdou+=i;
//            }
//            i++;
//        }
//        while (i<=n){
//            if (i%3==0){
//                sumdev += i;
//                System.out.println("3의 배수 : " + i);
//            }
//            i++;
//        }
//        System.out.println("배수의 합 : " + sumdev);
//        System.out.println(sumdou);
//  int sum = 0;
//        while (i<=n){
//            if (i%4==0){
//                System.out.println(i);
//            }else{
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);
        int multi = 0;
//        while(i<=9){
//        multi = i * 2;
//            System.out.println(multi);
//            i++;
//        }
    while (i<=9){
        while (n<=8){
            n++;
            multi = i*n;
            System.out.println(i + "*" + n + " = " + multi);
        }
        i++;
        n=1;
        }
    }
}
