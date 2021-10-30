package com.company;

import java.util.ArrayList;

/**
 * Triangle class to create new instances of triangle
 *
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
public class Triangle extends Polygon {
    /**
     * @param inputSides sides of triangle
     */
    public Triangle(float... inputSides) {
        super(inputSides);
    }

    /**
     * @return a boolean that tell us whether the triangle is equilateral or not
     */
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


}
