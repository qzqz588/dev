package CH13;

import java.awt.*;

//상위 클래스
class Point2D {
    int x ;
    int y ;
    Point2D(){
        System.out.println("Point2D 생성자 호출!!");
    }
    Point2D(int x){
        this.x = x;
        System.out.println(" Point2D(int x) 생성자 호출!!");
    }
    Point2D(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Point2D(int x,int y) 생성자 호출!!");
    }

    @Override
    public String toString() {
        return "point2D{" + "x=" + x + ", y=" + y + '}';}
}
//하위 클래스
class Point3D extends Point2D {
    int z;
    Point3D(int x, int y){
        super(x,y); //상속 관계에 있는 상위 클래스의 생성자 호출
        System.out.println("Point3D 생성자 호출!");
    }
    @Override
    public String toString() {
        return "Point3D{" + "z=" + z + ", x=" + x + ", y=" + y + '}';}
}

public class C02inheritanceMain {
    public static void main(String[] args) {
        Point3D obj = new Point3D(10 ,20);
        Point2D obj2 = new Point2D(10);
        Point2D obj3 = new Point2D(10, 20);

        obj.x=10;
        obj.y=20;
        obj.z=30;
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
