package org.task20;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 6);
        System.out.println("Perimeter of rectangle1 = " + rectangle1.calculatePerimeter());
        System.out.println("Area of rectangle1 = " + rectangle1.calculateArea());

        Triangle triangle1 = new Triangle(4, 4, 6, 6);
        System.out.println("Perimeter of triangle1 = " + triangle1.calculatePerimeter());
        System.out.println("Area of triangle1 = " + triangle1.calculateArea());

    }
}
