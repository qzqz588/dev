package CH18;
class Person{
    String name;
    String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }
}

class Man extends Person {
    @Override
    public String toString() {
        return "Man[" + "name='" + name + '\'' + ", age='" + age + '\'' + ']';
    }

    public Man(String name, String age) {
        super(name, age);
    }
}

class Woman extends Person{
    @Override
    public String toString() {
        return "Woman [" + "age='" + age + '\'' + ", name='" + name + '\'' + ']';
    }

    public Woman(String name, String age) {
        super(name, age);

    }
}
class Couple<X,Y>{
    private X member1;
    private Y member2;


    public Couple(X member1, Y member2) {
        this.member1 = member1;
        this.member2 = member2;
    }

    @Override
    public String toString() {
        return "Couple[" +  member1 +  member2 + ']';
    }
}

public class C03GenericMain {
    public static void main(String[] args) {
        //제네릭 객체 생성방법
        Couple<Man, Woman> couple1 = new Couple<>(new Man("철수","20"), new Woman("영희","30"));
        System.out.println(couple1);

    }
}
