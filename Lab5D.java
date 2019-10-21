package com;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Lab5D extends JPanel {

    private final int MAX_LAYER = 10;

    private ArrayList<Shape> shapes;

    /* CONSTRUCTOR */

    public Lab5D() {

        super();

        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();

        /* Create Shapes */

        shapes.add(new Rectangle(100, 100, 0, 100, 100));
        shapes.add(new Circle(400, 100, 1, 50));
        shapes.add(new Triangle(250, 350, 2, 100, 100));

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */

        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */

            for (Shape s : shapes) {

                /* Get X and Y coordinates */

                int x = s.getX();
                int y = s.getY();

                /* Check Layer */

                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red

                        // INSERT YOUR CODE HERE

                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        // INSERT YOUR CODE HERE

                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green

                        // INSERT YOUR CODE HERE

                    }

                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.area()), x, y);
                } // end layer if
            } // end shapes loop
        } // end layer loop
    } // end paintComponent()
}