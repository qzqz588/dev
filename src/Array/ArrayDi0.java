package Array;

public class ArrayDi0 {
    public static void main(String[] args) {
        //2x3 2차원 배열을 만든다
        int[][] arr = new int[2][3]; //행2(row), 열3(column)
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        //배열 출력
        System.out.println(arr[0][0] + ""); //0열 출력
        System.out.println(arr[0][1] + ""); //1열 출력
        System.out.println(arr[0][2] + ""); //2열 출력
        System.out.println(); //한 행이 끝나면 라인 하나를 추가한다
        System.out.println(arr[1][0] + ""); //0열 출력
        System.out.println(arr[1][1] + ""); //1열 출력
        System.out.println(arr[1][2] + ""); //2열 출력


    }
}
