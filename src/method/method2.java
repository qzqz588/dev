package method;

public class method2 {
    public static void main(String[] args) {
        boolean result = odd(6);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }else {
            return false;
        }

    }
}