package com.company;

import java.util.Objects;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float calculatePerimeter() {
        return (float) (2*3.14*radius);
    }
    public double calculateArea() {
        return 3.14*radius*radius;
    }
    public void draw() {
        System.out.println("Circle:{ " + "Area = " + calculateArea() + " // " + "Perimeter : " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
