package CH18;

public class C02CGenericMain {
    public static void main(String[] args) {
        PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
        System.out.println(ob1);	//캬라멜맛 팝콘이 출력

        PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
        System.out.println(ob2);	//버터옥수수맛 팝콘이 출력
    }
}