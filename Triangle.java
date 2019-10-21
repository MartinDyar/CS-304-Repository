package com;

public class Triangle extends Shape {

    public double base;
    public double height;

    public Triangle(int xInit, int yInit, int zInit, double baseInit, double heightInit) {
        super(xInit, yInit, zInit);
        base = baseInit;
        height = heightInit;
    }

    double getBase() {
        return base;
    }

    double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (getBase() * getHeight()) / 2d;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ") : " + "/ " + area() + " /";
    }
}
