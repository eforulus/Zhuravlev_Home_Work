package com.zhuravlev.HomeWork1;

import java.math.*;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        float square = 0;

        //We find the length of the sides of the triangle
        square =((x1 - x2)*(y1 - y3))-((x1 - x3)*(y1 - y2));
        square = square/2;
        //
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double AC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        length = AB + AC + BC;
        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
