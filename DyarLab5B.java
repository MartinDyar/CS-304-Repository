package dyarlab5b;

public class DyarLab5B {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(0, 0,10, 12);
        Rectangle rec2 = new Rectangle(1, 1,16, 20);

        Circle circle1 = new Circle(0,0,17);
        Circle circle2 = new Circle(1,1,20);

        Triangle tri1 = new Triangle(0,0,10, 12);
        Triangle tri2 = new Triangle(1,1,16, 20);

        System.out.println(rec1.toString());
        System.out.println(rec2.toString() + "\n");

        System.out.println(circle1.toString());
        System.out.println(circle2.toString() + "\n");

        System.out.println(tri1.toString());
        System.out.println(tri2.toString() + "\n");

        float totalRecArea;
        totalRecArea = rec1.area() + rec2.area();
        System.out.println("Total Rectangle Area: " + totalRecArea + "\n");

        float totalCircleArea;
        totalCircleArea = circle1.area() + circle2.area();
        System.out.println("Total Circle Area: " + totalCircleArea + "\n");

        float totalTriArea;
        totalTriArea = tri1.area() + tri2.area();
        System.out.println("Total Triangle Area: " + totalTriArea + "\n");
    }
}
