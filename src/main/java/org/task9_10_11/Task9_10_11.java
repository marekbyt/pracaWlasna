package org.task9_10_11;

public class Task9_10_11 {
    public static void main(String[] args) {
        Point2D center = new Point2D(0, 0 );
        Point2D point = new Point2D(3, 0);
        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("After move");
        MoveDirection moveDirection = new MoveDirection(4, -2);
        circle.move(moveDirection);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());


    }
}


//    3.0    18.84955592153876
//        28.274333882308138