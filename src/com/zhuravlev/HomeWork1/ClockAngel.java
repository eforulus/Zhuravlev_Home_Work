package com.zhuravlev.HomeWork1;


public class ClockAngel {
    public static void main(String[] args) {
        int hours = 9;
        int minutes = 5;
        int result = 0;
        int circle = 360;
        int hourArrow = 30;
        int minArrow = 6;

        /*Finding the angle between the minute hand and hour*/
        if (hours > 12 || minutes > 60) {
            hours = hours % 12;
            minutes = minutes % 60;
        }
        int hourSector = hours * hourArrow;
        int minSector = minutes * minArrow;

        result = hourSector - minSector;
        /*Check on the negative angle*/
        if (result < 0) {
            result = -result;
        }
        /*
        check that that the degree was not more than 180*/
        if (result > circle / 2) {
            result = circle - result;
        }
        System.out.println("Angel between hours and minute narrows is " + result);
    }
}
