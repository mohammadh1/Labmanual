package com.company;

import java.util.ArrayList;
/**
 * Circle class to create new instances of circle
 *
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
public class Circle extends Shape {
    private float radius;

    /**
     * @param radius radius of circle
     */
    public Circle(float radius) {
        this.radius = radius;
    }

    /**
     * @return radius of circle
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius radius of circle
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
