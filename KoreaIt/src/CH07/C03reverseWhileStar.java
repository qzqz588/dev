package CH07;

import java.util.Scanner;

public class C03reverseWhileStar {
    public static void main(String[] args) {
//        int dan = 2;

//        while (dan >= 2) {
//            int i = 1;
//            while (i <= 9) {
//                System.out.println(i*dan);
//                i++;
//            }
//            System.out.println();
//            dan--;
//        }
        int n = 5;
//        while (dan <= n) {
//            int i = 1;
//            while (i <= 9) {
//                System.out.println(i*dan);
//                i++;
//            }
//            System.out.println();
//            dan++;
//        }
//        int n = 5;
//        int m = 6;
//        int dan = n;
//        while (dan <= m) {
//            int i = 1;
//            while (i <= 9) {
//                System.out.println(i*dan);
//                i++;
//            }
//            System.out.println();
//            dan++;
//        }
        //별찍기(기본높이:4)

//        while (i<4){
//            System.out.println();
//            int j = 0;
//            while (j<5){
//                System.out.print("*");
//                j++;
//            }
//        i++;
//        }

//        while (i < 5) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        while (i >= 1) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        }
//        while (i >= 1) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int i = 0;
//        while(i<h) {
//            int j=0;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int i = 0;
//        while (i < h) {
//            int j = 0;
//            while (j <= h-i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //전체를 와일문으로 묶어서 h값의 가운데까지는 증가(if) 그 이후로는 감소(else)

//        while (true) {
//            if (i < center) {
//                while (i < center) {
//                    int j = 0;
//                    while (j < h - i - 1) {
//                        System.out.print(" ");
//                        j++;
//                    }
//                    j = 1;
//                    while (j <= 2 * i + 1) {
//                        System.out.print("*");
//                        j++;
//                    }
//                    while (j < h - i) {
//                        System.out.print(" ");
//                        j++;
//                    }
//                    System.out.println();
//                    i++;
//                }
//            }
//            while (i < h) {
//                int a = h - i;
//                int j = 0;
//                while (j < i) {
//                    System.out.print(" ");
//                    j++;
//                }
//                j = 1;
//                int k = 0;
//                while (k < 2 * a - 1) {
//                    System.out.print("*");
//                    k++;
//                }
//                while (j < h) {
//                    System.out.print(" ");
//                    j++;
//                }
//                System.out.println();
//                i++;
//            }
//            break;
//        }

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i = 0;
        int center = h / 2;

        while (true) {
            if (i < center) {
                while (i < center) {
                    int j = 0;
                    while (j < h - i - 1) {
                        System.out.print(" ");
                        j++;
                    }
                    j = 1;
                    while (j <= 2 * i + 1) {
                        System.out.print("*");
                        j++;
                    }
                    while (j < h - i) {
                        System.out.print(" ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
            }
            while (i < h) {
                int a = h - i;
                int j = 0;
                while (j < i) {
                    System.out.print(" ");
                    j++;
                }
                j = 1;
                int k = 0;
                while (k < 2 * a - 1) {
                    System.out.print("*");
                    k++;
                }
                while (j < h) {
                    System.out.print(" ");
                    j++;
                }
                System.out.println();
                i++;
            }
            break;
        }

    }
}
