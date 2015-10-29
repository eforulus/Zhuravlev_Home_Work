package com.zhuravlev.HomeWork2.numbersFibonacci;

import java.util.Arrays;

/**
 * @author Zhuravlev Egor
 * @created 26.10.2015.
 */
public class NumbersFibonacci {
    public int arrays[];

    public NumbersFibonacci(int index) {
        arrays = new int[index];
    }

    public void numFib(int inner) {
        if (inner == 0) return;
        else numFib(inner - 1);
        {if(inner <= 1)
            arrays[inner] = inner;
            else {
            arrays[inner] = arrays[inner - 1] + arrays[inner - 2];

            }
        }
    }

}