package javaTest;

import java.util.Scanner;

public class Star00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = 0; j > i; j++) {
                System.out.println("");
            }
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
