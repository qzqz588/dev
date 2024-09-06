package Array;

public class ArrayRef03 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50}; //배열 변수 선언,배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i<= students.length; i++){ //length : 배열의 수를 출력
            System.out.println((i+1) + "점수" + students[i]);
        }
        //리팩토링
    }
}
