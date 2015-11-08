package com.zhuravlev.HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Zhuravlev Egor
 * @created 17.10.2015.
 */
public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 5},
                {9, 0, 1, 9},
                {3, 4, 3, 7}
        };
        int[][] result;
        /*Check equality of the sides of the matrix! If not, it displays an error!*/
        if (array.length != array[0].length) {
            System.out.println("Error!" +
                    " The code can not be released" +
                    " because the length of the matrix " +
                    "is not equal to the height");
        } else {
            /*displaying the original matrix*/
            System.out.println("The original matrix");
            for (int[] i : array) {
                for (int j : i)
                    System.out.print(j + " ");
                System.out.println();
            }


            /*introduce a temporary variable! tmp
            *mirror your matrix about the main diagonal */

            int tmp;
            for (int n = 0; n < array.length; n++) {
                for (int i = 0 + n, j = 0; i < array.length; i++, j++) {
                    tmp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = tmp;
                }
            }


            System.out.println("Mirroring the main diagonal");
            for (int[] i : array) {
                for (int j : i)
                    System.out.print(j + " ");
                System.out.println();
            }
            /*mirror your matrix about secondary diagonal*/
            System.out.println("Mirroring secondary diagonal");
            for (int n = array.length - 1, h = 0; n > 0; n--, h++) {
                for (int i = n - 1, j = h + 1; j < array.length; j++, i--) {
                    tmp = array[n][j];
                    array[n][j] = array[i][h];
                    array[i][h] = tmp;
                }
            }
            for (int[] i : array) {
                for (int j : i)
                    System.out.print(j + " ");
                System.out.println();
            }

        }
    }


}