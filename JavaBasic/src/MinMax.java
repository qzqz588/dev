public class MinMax {
    public static void main(String[] args) {
        int[] sex = {5, 6, 7, 8, 9};
        int max =0;
        int min =0;
        for (int i : sex) {
            max = Math.max(i, max);
        }
        System.out.println(max);
    }
}
