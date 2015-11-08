package com.zhuravlev.HomeWork1;


public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        /*corrected code, forgot to check =)*/
        first = second + first;
        second = first - second;
        first = first - second;

        System.out.println("First = " + first + " , second = " + second);
    }
}
