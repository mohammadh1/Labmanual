package com.company;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Rectangle {
    private ArrayList<Float> sides;

    public Rectangle(float a, float b, float c, float d) {
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    public ArrayList<Float> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Float> sides) {
        this.sides = sides;
    }

    public boolean isSquare() {
        float temp = sides.get(0);
        int i = 0;
        for (float num : sides) {
            if (temp == num)
                i++;
        }
        boolean flag = i == 4 ? true : false;
        return flag;
    }

    public float calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }
    public double calculateArea() {
        boolean Square = isSquare();
        if (!Square) {
            if (sides.get(0) == sides.get(1))
                return sides.get(0) * sides.get(2);
            else
                return sides.get(0) * sides.get(1);
        }
        else
            return sides.get(0) * sides.get(0);
    }
    public void draw() {
        System.out.println("Rectangle:{ " + "Area = " + calculateArea() + " // " + "Perimeter : " + calculatePerimeter());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sides.equals(rectangle.sides);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
