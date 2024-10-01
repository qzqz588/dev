package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
       rectangle.width=5;
       rectangle.height=5;
       int area = rectangle.calculateArea();
        System.out.println(area);
       int perimeter = rectangle.calculatePerimeter();
        System.out.println(perimeter);
       boolean issquare = rectangle.isSquare();
        System.out.println(issquare);
    }
}