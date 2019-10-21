package dyarlab5b;

public class Circle {
    public float radius;
    public Point center;

    public Circle(int xInit, int yInit, float radiusInit) {
        center = new Point(xInit, yInit);
        radius = radiusInit;
    }

    float getRadius() {
        return this.radius;
    }

    float area() {
        return (3.14f * (getRadius() * getRadius()));
    }

    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + ") : " + "( " + area() + " )";
    }
}