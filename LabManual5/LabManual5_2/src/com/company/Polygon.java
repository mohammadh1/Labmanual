package com.company;

import java.util.ArrayList;
/**
 * Polygon class to create new instances of polygon
 * superclass = Shape
 * subclasses = Rectangle - Triangle
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
public class Polygon extends Shape {
    protected ArrayList<Float> sides;

    /**
     * @param inputSides sides of polygon
     */
    public Polygon(float... inputSides) {
        super();
        sides = new ArrayList<>();
        for (Float side : inputSides) {
            this.sides.add(side);
        }
    }

    /**
     * @return sides of polygon
     */
    public ArrayList<Float> getSides() {
        return sides;
    }

    /**
     * @param sides sides of polygon
     */
    public void setSides(ArrayList<Float> sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "sides=" + sides +
                '}';
    }
}
