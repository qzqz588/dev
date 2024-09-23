package CH10;

import java.util.Arrays;
import java.util.Scanner;

public class C01원시타입배열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        arr1[0] = sc.nextInt();
        arr1[1] = sc.nextInt();
        arr1[2] = sc.nextInt();
        arr1[3] = sc.nextInt();
        arr1[4] = sc.nextInt();
//        System.out.println("배열 길이 : " + arr1.length);
//        System.out.println(arr1 instanceof Object);
//        System.out.println("---------------------------");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i] + " ");
//        }
//        System.out.println();
//        System.out.println("---------------------------");
//
//        for (int el : arr1)
//            System.out.printf(el + " ");
//        Arrays.stream(arr1).forEach(el -> System.out.printf(el + ""));
//        System.out.println("\n----------------");
//        Arrays.stream(arr1).forEach(System.out::print);

        int max = arr1[0];
        int min = arr1[0];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            max=Math.max(max,arr1[i]);
            min=Math.min(min,arr1[i]);
            sum += arr1[i];
        }
        double avg = (double) sum/arr1.length;
        System.out.println(avg);
        System.out.println(max + min);
    }
}
