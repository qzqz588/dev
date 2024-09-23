package CH09;
// 정보은닉 : 민감한 데이터를 차단하거나 우회하는 방법을 사용하는 것
// 정보은닉을 적용하기 위해 사용하는 클래스 : 접근 한정자
// public : 모든 클래스에서 접근 가능
// default : 동일 패키지에 속한 클래스에서만 접근 허가, 기본값으로 한정자를 쓰지 않는 경우
// private : 현재 클래스에서만 접근이 가능
class C01Person {
    private String name;
    private int age;
    private String addr;

    public C01Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    //constructor


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "C01Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    //getter and setter
    // getter : Getter 메소드는 클래스의 프라이빗 멤버 변수 값을 읽는 데 사용

    public class C01정보은닉 {
        public static void main(String[] args) {
            C01Person hong = new C01Person("홍길동", 50, "대구");
            int age = hong.getAge(); // private 변수를 읽어옴
            hong.setAddr("울산"); //변수 값을 재설정
        }
    }
}

