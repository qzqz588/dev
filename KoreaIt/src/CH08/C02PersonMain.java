package CH08;
class C02person{
    //속성
    String name;
    int age;
    float height;
    double weight;

}

public class C02PersonMain {
    public static void main(String[] args) {
        C02person hong = new C02person();
        hong.name = "홍길동";
        hong.age = 44;
        hong.height = 177.5f;
        hong.weight = 70.5;
        System.out.printf("%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight);
    }
}
