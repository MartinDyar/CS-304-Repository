package dyarlab5b;

public class Rectangle {
    public float length;
    public float width;
    public Point center;

    public Rectangle(int xInit, int yInit, float lengthInit, float widthInit) {
        center = new Point(xInit, yInit);
        length = lengthInit;
        width = widthInit;
    }

    float getLength() {
        return this.length;
    }

    float getWidth() {
        return this.width;
    }

    float area() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + ") : " + "[ " + area() + " }";
    }
}

