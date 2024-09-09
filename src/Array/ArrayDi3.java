package Array;

public class ArrayDi3 {
    public static void main(String[] args) {

        //2x3 2차원 배열을 만든다
        int[][] arr = new int[4][4]; //2차원 변수 선언

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
                //2중 for문으로 row값, column값을 변수 i를 이용해 증감식으로 표현
                System.out.print(arr[row][column] + ""); //행,열 출력
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}