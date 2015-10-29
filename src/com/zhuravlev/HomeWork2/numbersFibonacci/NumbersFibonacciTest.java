package com.zhuravlev.HomeWork2.numbersFibonacci;

import java.util.Scanner;

/**
 * @author Zhuravlev Egor
 * @created 17.10.2015.
 */
public class NumbersFibonacciTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inner = scanner.nextInt();
        int[] array = new int[inner];

        for (int index = 0; index < array.length - 1; index++) {
            if (index <= 1)
                array[index] = index;
            else
                array[index] = array[index - 1] + array[index - 2];
            System.out.print(array[index] + ", ");
        }

    }
}
