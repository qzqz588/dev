package CH06;

import java.util.Scanner;

public class C01IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=-1;
        while(true){
            System.out.println("-------------M E N U---------------");
            System.out.println("1. 도서 조회");
            System.out.println("2. 도서 등록");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 종료");
            System.out.println("-------------M E N U---------------");
            System.out.println("번호입력 : ");
            num = sc.nextInt();
            switch(num) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("종료힙니다");
                    System.exit(-1);
                    //break;
                    break;
                default:
                    System.out.println("올바른 값을 입력하세요");
            }
        }
    }
}
