package com.company;

import java.util.ArrayList;
/**
 * Rectangle class to create new instances of rectangle
 *
 * @version 0.0
 * @author Mohammad Hoseinkhani
 */
public class Rectangle extends Polygon {
    /**
     * @param inputSides sides of rectangle
     */
    public Rectangle(float... inputSides) {
        super(inputSides);
    }

    /**
     * @return a boolean variable that tell us whether rectangle is square or not
     */
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

}
