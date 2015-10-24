package com.zhuravlev.HomeWork2;

import java.util.Arrays;

/**
 * @author Zhuravlev Egor
 * @created 17.10.2015.
 */
public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        for (int index = 0;index < array.length; index++){
            for (int inner = 0; inner <= array.length; inner++) {
                System.out.print(array[index][inner] + ", ");
            }
            System.out.println();
        }
        for(int[] index : array){
            for (int inner : index)
                System.out.print(inner + ", ");
            System.out.println();
        }
        /*Second embodiment of the display of */
        System.out.println(Arrays.deepToString(array));
    }
}
