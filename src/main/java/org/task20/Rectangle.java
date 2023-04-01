package org.task20;

public class Rectangle extends Shape{

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter(){

        return  (2 * a) + (2 * b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
