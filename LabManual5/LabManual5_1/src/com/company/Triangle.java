package com.company;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle {
    private ArrayList<Float> sides;

    public Triangle(float a, float b, float c) {
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    public ArrayList<Float> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Float> sides) {
        this.sides = sides;
    }
    public boolean isEquilateral() {
        float temp = sides.get(0);
        int i = 0;
        for (float num : sides) {
            if (temp == num)
                i++;
        }
        boolean flag = i == 3 ? true : false;
        return flag;
    }

    public float calculatePerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }
    public double calculateArea() {
        float p = calculatePerimeter()/2;
        return sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
    }
    public void draw() {
        System.out.println("Triangle:{ " + "Area = " + calculateArea() + " // " + "Perimeter : " + calculatePerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sides.equals(triangle.sides);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
