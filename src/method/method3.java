package method;

public class method3 {
    public static void main(String[] args) {
        checkAge(15);
        checkAge(20);
    }
    public static void checkAge(int age){
        if(age < 18){
            System.out.println("미성년자는 출입이 불가능 합니다.");
            return;
        } else {
                System.out.println("출입이 가능합니다.");
            }
        }
    }
