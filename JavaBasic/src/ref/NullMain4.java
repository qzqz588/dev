package ref;

public class NullMain4 {
    public static void main(String[] args) {
        Bigdata bigdata = new Bigdata();
        bigdata.data = new Data();
        System.out.println("bigdata = " + bigdata.count);
        System.out.println("bigdata = " + bigdata.data);

        System.out.println("bigdata = " + bigdata.data.value);
    }
}
