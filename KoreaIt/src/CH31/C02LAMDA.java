package CH31;

interface Printer{
//    String print(String message);
    String print(String message);
//    String print();
}

public class C02LAMDA {
    public static void main(String[] args) {
//    Printer printer = (message)->{System.out.println(message);};
//    printer.print("Helloworld");


//        Printer printer = (message)->{
//            return message;
//        };
//        String msg = printer.print("TEST");
//        System.out.println(msg);

        Printer printer = (message)->message + "!!!"; //함수 재정의 // 라인이 한 줄 이라면 return과 같은 효과를 낸다
        String msg = printer.print("TEST");
        System.out.println(msg);
    }
}
