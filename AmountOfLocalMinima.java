package org.darmokhval.second_pack_of_tasks;

import java.util.Scanner;

public class AmountOfLocalMinima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of matrix: ");
        int row = scan.nextInt();
        int[][] array = new int[row][row];

        System.out.println("Enter element of the matrix: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        int minCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean isLeftLarger = true;
                boolean isRightLarger = true;
                boolean isUpperLarger = true;
                boolean isLowerLarger = true;
                boolean isUpperLeftLarger = true;
                boolean isUpperRightLarger = true;
                boolean isLowerLeftLarger = true;
                boolean isLowerRightLarger = true;
                if (i > 0) {
                    if (array[i - 1][j] < array[i][j]) {
                        isUpperLarger = false;
                    }
                }
                if (i > 0 && i < array.length - 1) {
                    if (array[i + 1][j] < array[i][j]) {
                        isLowerLarger = false;
                    }
                }
                if (i > 0 && j > 0) {
                    if (array[i - 1][j - 1] < array[i][j]) {
                        isUpperLeftLarger = false;
                    }
                }
                if (i > 0 && j > 0 && j < array[i].length - 1) {
                    if (array[i - 1][j + 1] < array[i][j]) {
                        isUpperRightLarger = false;
                    }
                }
                if (i > 0 && j > 0 && i < array.length - 1) {
                    if (array[i + 1][j - 1] < array[i][j]) {
                        isLowerLeftLarger = false;
                    }
                }
                if (i > 0 && j > 0 && i < array.length - 1 && j < array[i].length - 1) {
                    if (array[i + 1][j + 1] < array[i][j]) {
                        isLowerRightLarger = false;
                    }
                }
                if (j > 0) {
                    if (array[i][j - 1] < array[i][j]) {
                        isLeftLarger = false;
                    }
                }
                if (j > 0 && j < array[i].length - 1) {
                    if (array[i][j + 1] < array[i][j]) {
                        isRightLarger = false;
                    }
                }
                if (isLeftLarger && isRightLarger && isLowerLarger && isUpperLarger && isLowerRightLarger && isLowerLeftLarger && isUpperLeftLarger && isUpperRightLarger) {
                    minCount++;
                }
            }
        }
        System.out.println(minCount);
    }
}
