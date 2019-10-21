package com;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(int xInit, int yInit, int zInit, double lengthInit, double widthInit) {
        super(xInit, yInit, zInit);
        length = lengthInit;
        width = widthInit;
    }

    double getLength() {
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ") : " + "[ " + area() + " }";
    }
}
