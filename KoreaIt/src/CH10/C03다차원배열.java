package CH10;

public class C03다차원배열 {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {100,110,120},
        };
        System.out.println("행의 길이 : " + arr.length);
        System.out.println("[0]행의 길이 : " + arr[0].length);
        System.out.println("[1]행의 길이 : " + arr[1].length);
        System.out.println("[2]행의 길이 : " + arr[2].length);
        System.out.println("[3]행의 길이 : " + arr[3].length);
    }
}
