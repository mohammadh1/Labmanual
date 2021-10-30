package com.company;

import java.util.ArrayList;
/**
 * Shape class to store all shapes
 * superclass = Paint
 * subclasses = Circle - Polygon
 *
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
import static java.lang.Math.sqrt;

public class Shape extends Paint {
    /**
     * constructor of superclass (superclass = Paint)
     */
    public Shape() {
        super();
    }

    /**
     * @param shape given shape for calculating perimeter
     * @return a float number that shows perimeter
     */
    public float calculatePerimeter(Shape shape) {
        if (shape instanceof Circle) {
            return (float) (2*3.14*((Circle) shape).getRadius());
        }
        else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getSides().get(0)
                    + ((Rectangle) shape).getSides().get(1)
                    + ((Rectangle) shape).getSides().get(2)
                    + ((Rectangle) shape).getSides().get(3);
        }
        else if (shape instanceof Triangle) {
            return ((Triangle) shape).getSides().get(0)
                    + ((Triangle) shape).getSides().get(1)
                    + ((Triangle) shape).getSides().get(2);
        }
        else
            return 0;
    }
    /**
     * @param shape given shape for calculating area
     * @return a float number that shows area
     */
    public float calculateArea(Shape shape) {
        if (shape instanceof Circle)
            return (float) (3.14 * ((Circle) shape).getRadius() * ((Circle) shape).getRadius());

        if (shape instanceof Rectangle) {
            return (float) ((Rectangle) shape).getSides().get(0)
                    * ((Rectangle) shape).getSides().get(1);
        }
        if (shape instanceof Triangle) {
            float p = calculatePerimeter(shape) / 2;
            float a = p - ((Triangle) shape).getSides().get(0);
            float b = p - ((Triangle) shape).getSides().get(1);
            float c = p - ((Triangle) shape).getSides().get(2);
            float A = (float) sqrt(p * (p - a) * (p - b) * (p - c));
            return A;
        }

        else
            return 0;
    }

    /**
     * @param shape selected shape for drawing
     * @return shape name - its perimeter + its area
     */
    public String draw(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println(shape + "\nPerimeter: " + calculatePerimeter(shape)
                    + "\nArea : " + calculateArea(shape) + "\n**************");
        }
        if (shape instanceof Rectangle) {
            System.out.println("Rectangle{" + shape + "\nPerimeter: " + calculatePerimeter(shape)
                    + "\nArea : " + calculateArea(shape) + "\n**************");
        }
        if (shape instanceof Triangle) {
            System.out.println("Triangle{" + shape + "\nPerimeter: " + calculatePerimeter(shape)
                    + "\nArea : " + calculateArea(shape) + "\n**************");
        }
        return "Invalid input";
    }
}
