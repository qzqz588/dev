package ref;

public class NullMain3 {
    public static void main(String[] args) {
        Bigdata bigdata = new Bigdata();
        System.out.println("bigdata = " + bigdata.count);
        System.out.println("bigdata = " + bigdata.data);


        System.out.println("bigdata = " + bigdata.data.value);
    }
}
