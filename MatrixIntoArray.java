package org.darmokhval.second_pack_of_tasks;

import java.util.Arrays;

public class MatrixIntoArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] finalArray = new int[25];
        int count = 0;
        int finalArrayCount = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == count) {
                    finalArray[finalArrayCount] = array[i][j];
                    finalArrayCount++;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            count++;
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
