package dyarlab5b;

public class Point {
    public int x;
    public int y;

    public Point(int xInit, int yInit) {
        if(xInit < 0) {
            x = 0;
        } else if(xInit > 500) {
            x = 500;
        } else {
            x = xInit;
        }

        if(yInit < 0) {
            y = 0;
        } else if(yInit > 500) {
            y = 500;
        } else {
            y  = yInit;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
