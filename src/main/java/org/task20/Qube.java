package org.task20;

public class Qube extends Shape3D implements Fillable {

    private int a;

    public Qube(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public int fil(double volume) {
        double maxVolume = calculateVolume();
        if (maxVolume == volume) {
            return 0;
        } else if (maxVolume <= volume) {
            return -1;

        }
        return 1;
    }
}