package org.task20;

public class Triangle extends Shape {

    private final double h;
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        return 0.5 * a * h;
    }
}
