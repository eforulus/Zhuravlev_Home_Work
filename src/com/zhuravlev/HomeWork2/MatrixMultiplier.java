package com.zhuravlev.HomeWork2;

/**
 * @author Zhuravlev Egor
 * @created 17.10.2015.
 */
public class MatrixMultiplier {

    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6 },
                {7, 5, 4, 1 }
        };
        int[][] second ={
                {1,2 },
                {3,2 },
                {7,2 },
                {3,2 }
        };
        int firstLength = first.length;
        int secondLength = second[0].length;
        int secondLength1 = second.length;

        //сравниваем длину первой матрицы и высоту второй
        if(first[0].length == second.length){
          int[][] result = new int[first.length][second[0].length];

            for(int index = 0; index < firstLength; index++){
                for(int inner = 0; inner < secondLength; inner++){
                    for(int kinner = 0; kinner < secondLength1; kinner++){
                        result[index][inner] += first[index][kinner]*second[kinner][inner];
                    }
                }
            }
            for(int[] index : result){
                for (int inner : index)
                    System.out.print(inner + ", ");
                System.out.println();
            }
        }


        else{
            System.out.println("multiplication impossible," +
                    " the number of rows of the first array does" +
                    " not match the number of columns of the second!");
        }

    }
}
