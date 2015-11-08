package com.zhuravlev.HomeWork2;

import java.util.Scanner;

/**
 * @author Zhuravlev Egor
 * @since 17.10.2015.
 */
public class NumbersFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter in keyboard N numbers Fibonacci");
        int inner = scanner.nextInt();
        int[] array = new int[inner];

        for (int index = 0; index < array.length; index++) {
            if (index <= 1) {
                array[index] = index;
            } else {
                array[index] = array[index - 1] + array[index - 2];
            }
            System.out.print(array[index] + ", ");
        }

    }
}
