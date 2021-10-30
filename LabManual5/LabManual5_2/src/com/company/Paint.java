package com.company;

import java.util.ArrayList;
/**
 * Paint class to create new instances of triangle
 * subclasses = Shape
 *
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * constructor of Paint class
     * allocating memory for shapes (ArrayList)
     */
    public Paint() {
        this.shapes = new ArrayList<>();
    }

    /**
     * @return list of shapes
     */
    public ArrayList<Shape>  getShapes() {
        return shapes;
    }

    /**
     * @param shapes list of shapes
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * @param shape shape that we wanted to add in Arraylist of Shape
     */
    public void addShape (Shape shape) {
        if (shape instanceof Circle || shape instanceof Triangle || shape instanceof Rectangle)
            shapes.add(shape);
    }

    /**
     * print all shapes with theirs information
     */
    public void printAll() {
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Polygon> polygons = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                circles.add((Circle) shape);
            }
            if (shape instanceof Polygon ) {
                polygons.add((Polygon) shape);
            }
        }
        for (Polygon polygon :polygons) {
            if (polygon instanceof Rectangle) {
                rectangles.add((Rectangle) polygon);
            }
            if (polygon instanceof Triangle) {
                triangles.add((Triangle) polygon);
            }
        }
        System.out.println("Circles : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("*************************************");
        System.out.println("Triangles : ");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
        System.out.println("*************************************");
        System.out.println("Rectangle : ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    /**
     * draw all shapes with theirs area and theirs perimeter
     */
    public void drawAll() {
        for (Shape shape : shapes) {
                shape.draw(shape);
        }
    }

    /**
     * checking specific state for polygons
     */
    public void describe() {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Triangle{" + shape + "      is square = " + ((Rectangle) shape).isSquare());
            }
            if (shape instanceof Triangle) {
                System.out.println("Rectangle{" + shape + "      is equilateral = " + ((Triangle) shape).isEquilateral());

            }
        }
    }

}
