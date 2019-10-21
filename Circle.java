package com;

public class Circle extends Shape{

    public double radius;

    public Circle(int xInit, int yInit, int zInit, double radiusInit) {
        super(xInit, yInit, zInit);
        radius = radiusInit;
    }

    double getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return (3.14d * (getRadius() * getRadius()));
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ") : " + "( " + area() + " )";
    }
}
