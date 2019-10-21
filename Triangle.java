package dyarlab5b;

public class Triangle {
    public float base;
    public float height;
    public Point center;

    public Triangle(int xInit, int yInit, float baseInit, float heightInit) {
        center = new Point(xInit, yInit);
        base = baseInit;
        height = heightInit;
    }

    float getBase() {
        return base;
    }

    float getHeight() {
        return height;
    }

    float area() {
        return (getBase() * getHeight()) / 2f;
    }

    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + ") : " + "/ " + area() + " /";
    }
}