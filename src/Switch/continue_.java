package Switch;

public class continue_ {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5){
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
        }
    }
}
