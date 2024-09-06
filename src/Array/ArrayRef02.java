package Array;

public class ArrayRef02 {
    public static void main(String[] args) {
        int[] students;  //배열 변수 선언
        students = new int[5];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("students = " + students);
        //참조 값 확인

        //변수 값 사용
        for (int i = 0; i<= students.length; i++){ //length : 배열의 수를 출력
            System.out.println((i+1) + "점수" + students[i]);
        }
        //리팩토링


    }
}
