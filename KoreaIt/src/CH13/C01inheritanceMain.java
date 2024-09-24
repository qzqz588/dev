//package CH13;
////상위 클래스
//class Point2D {
//    int x ;
//    int y ;
//    Point2D(){}
//
//    @Override
//    public String toString() {
//        return "point2D{" + "x=" + x + ", y=" + y + '}';}
//}
////하위 클래스
//class Point3D extends Point2D {
//    int z;
//    Point3D(){
//        super(); //상속 관계에 있는 상위 클래스의 생성자 호출
//        System.out.println("Point3D 생성자 호출!");
//    }
//    @Override
//    public String toString() {
//        return "Point3D{" + "z=" + z + ", x=" + x + ", y=" + y + '}';}
//}
//
//public class C01inheritanceMain {
//    public static void main(String[] args) {
//        Point3D obj = new Point3D();
//        obj.x=10;
//        obj.y=20;
//        obj.z=30;
//        System.out.println(obj);
//    }
//}
