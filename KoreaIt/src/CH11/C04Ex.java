package CH11;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.


import java.util.ArrayList;

class ArrayUtils {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
        int[] arr = new int[a.length+b.length];
        for (int i = 0; i<arr.length; i++){
            if (a.length > i) {
                arr[i] = a[i];
            }else
                arr[i] = b[i - a.length];
            }
        return arr;
    }

    public static void print (int[] sex){
        for (int i = 0; i < sex.length; i++) {
            System.out.print(sex[i]);
        }
    }
}

public class C04Ex {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtils.concat(array1, array2);
        ArrayUtils.print(array3);
    }
}