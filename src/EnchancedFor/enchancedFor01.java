package EnchancedFor;

public class enchancedFor01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);
        }
        //향상된 for문, for-each문
        for (int number : numbers){
            System.out.println("number = " + number);
        }
        //for-each문을 사용할 수 없는 경우, 증가하는 index값 필요.
        for (int i =0; i< numbers.length; i++){
            System.out.println("i = " + i);
        }
    }
}