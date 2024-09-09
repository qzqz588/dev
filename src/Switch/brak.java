package Switch;

public class brak {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum +i;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }i++;
        }
    }
}
