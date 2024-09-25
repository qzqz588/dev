package CH14;

abstract class Shape{
    abstract void 넓이();
}
class Rectangle extends Shape{
    int width;
    int height;

    @Override
    void 넓이() {
        int 넓이 = width *height;
        System.out.println(넓이);
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

}
class Triangle extends Shape{
    int height;
    int bottomLine;

    public Triangle(int height, int bottomLine) {
        this.height = height;
        this.bottomLine = bottomLine;
    }

    @Override
    void 넓이() {
        int 넓이 = height*bottomLine/2;
        System.out.println(넓이);
    }
}
class Circle extends Shape{
    int radius;
    static final double PI=3.14;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void 넓이() {
        double 넓이 = radius*radius*PI;
        System.out.println(넓이);
    }
}
public class C03EX {
    public static void 전체넓이확인(Shape shape)
    {
        //넓이 출력
        shape.넓이();
    }

    public static void main(String[] args) {
        전체넓이확인(new Rectangle(45,45));
        전체넓이확인(new Triangle(100,20));
        전체넓이확인(new Circle(5));
    }
}