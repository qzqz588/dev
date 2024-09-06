package Q;

public class Q9 {
    public static void main(String[] args) {
       /* int x = 5;
        if (x % 2 == 0) {
        System.out.println("x = " + x + " 짝수 입니다.");
        } else {
            System.out.println("x = " + x + " 홀수 입니다.");
        }
    }
}
*/
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수"; // X를 2로 나누었을 때 나머지가 없다면 짝수, 있다면 홀수
        System.out.println("result = " + result);
    }
}

