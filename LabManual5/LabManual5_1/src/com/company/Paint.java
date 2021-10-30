package com.company;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;
    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public void setCircles(ArrayList<Circle> circles) {
        this.circles = circles;
    }

    public ArrayList<Triangle> getTriangles() {
        return triangles;
    }

    public void setTriangles(ArrayList<Triangle> triangles) {
        this.triangles = triangles;
    }

    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }

    public void setRectangles(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void printAll() {
        System.out.println("Circles : ");
        for (Circle circle : circles) {
            System.out.println(circles.indexOf(circle)+1 + "# Circle : "
                    + "\nArea = " + circle.calculateArea()
                    + "\n // \n"
                    + " Perimeter = " + circle.calculatePerimeter());
        }
        System.out.println("*************************************");
        System.out.println("Triangles : ");
        for (Triangle triangle : triangles) {
            System.out.println(triangles.indexOf(triangle)+1 + "# Triangle : "
                    + "\nArea = " + triangle.calculateArea()
                    + "\n // \n"
                    + " Perimeter = " + triangle.calculatePerimeter()
                    + "\n // \n"
                    + "Equilateral : " + triangle.isEquilateral() );
        }
        System.out.println("*************************************");
        System.out.println("Rectangle : ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangles.indexOf(rectangle)+1 + "# Triangle : "
                    + "\nArea = " + rectangle.calculateArea()
                    + "\n // \n"
                    + " Perimeter = " + rectangle.calculatePerimeter()
                    + "\n // \n"
                    + "Equilateral : " + rectangle.isSquare() );
        }
    }
    public void drawAll() {
        System.out.println("Circles : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("*************************************88");
        System.out.println("Triangles : ");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
        System.out.println("*************************************88");
        System.out.println("Rectangle : ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

}
