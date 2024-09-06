package Switch;

public class while_2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 50;
        int endnum = 100;
        // i -2, endnum = 3
        while (i <= endnum) {
            sum = sum + i;
            System.out.println("sum" + sum);
            i++;

        }
    }
}