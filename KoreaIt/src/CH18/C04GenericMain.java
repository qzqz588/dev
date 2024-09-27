package CH18;

class Animal{}
class Tiger extends Animal{
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tiger[" + "name='" + name + '\'' + ']';
    }
}
class Panda extends Animal{
    String name;

    public Panda(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Panda[" + "name='" + name + '\'' + ']';
    }
}
class Cat extends Animal{
    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat[" + "name='" + name + '\'' + ']';
    }
}


public class C04GenericMain {
    //함수에 제네릭 적용 시 함수의 반환타입 앞에 제네릭 타입을 넣어야함
    //Generic (한번에 다양한 객체를 받을 수 없으나 번거로운 과정이 불필요 하다.)
    public static <T extends Animal> void PrintInfo(T[] arr) {
        for(T el : arr)
            System.out.println(el);
    }

    //Object (다양한 객체를 받을 순 있으나 Downcasting을 수반한다.)
    public static void PrintInfo2(Object[] arr) {
        for(Object el : arr) {
            System.out.println(el);
        }
    }
    public static void main(String[] args) {
        Tiger[] arr1 = {new Tiger("시베리안"),new Tiger("뱅갈"),new Tiger("백두산")};
        PrintInfo(arr1);
        Panda[] arr2 = {new Panda("개팬더"),new Panda("쿵푸팬더"),new Panda("래서팬더")};
        PrintInfo(arr2);
        //인자들의 자료형이 다를 경우 제네릭 타입을 사용하기 힘들다.
        Object[] arr3 = {new Tiger("시베리안"),new Panda("쿵푸팬더"), new Cat("스코티시폴드")};
        PrintInfo2(arr3);
    }
}
