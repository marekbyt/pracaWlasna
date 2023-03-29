package org.task9_10_11;

public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        // pirwiastek((x-h)^2 + (y-k)^) =r^
        return Math.sqrt(Math.pow(point.getX()  - center.getX(), 2 ) + Math.pow((point.getY() - center.getY()), 2));

    }
    public double getPerimeter () {

        return 2 * Math.PI * getRadius();
    }

    public double getArea(){
    //Pi * r ^ 2
        return Math.PI * Math.pow(getRadius(), 2);

    }

    @Override
    public void move(MoveDirection moveDirection) {
    center.move(moveDirection);
    point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {

        point.getX() * resizeFactor
        double v = point.getY() * resizeFactor;
    }
}
