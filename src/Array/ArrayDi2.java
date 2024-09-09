package Array;

public class ArrayDi2 {
    public static void main(String[] args) {

        //2x3 2차원 배열을 만든다
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//행2(row), 열3(column)

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + ""); //행,열 출력
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}