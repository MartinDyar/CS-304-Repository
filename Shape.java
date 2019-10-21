package com;

public abstract class Shape {

    private Point center;

    public Shape(int xInit, int yInit, int zInit) {
        this.center = new Point(xInit, yInit, zInit);
    }

    public abstract double area();

    public int getX() {
        return this.center.getX();
    }

    public int getY() {
        return this.center.getY();
    }

    public int getZ() {
        return this.center.getZ();
    }
}
