package org.darmokhval.second_pack_of_tasks;


import java.util.Scanner;

public class MaxElemOfRightCorner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of matrix: ");
        int row = scan.nextInt();
        int[][] arrayPoints = new int[row][row];
        int arrayLen = arrayPoints.length;

        System.out.println("Enter element of the matrix: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                arrayPoints[i][j] = scan.nextInt();
            }
        }
        int maxNumber = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i + j >= arrayLen - 1) {
                    if (arrayPoints[i][j] >= maxNumber) {
                        maxNumber = arrayPoints[i][j];
                    }
                }
            }
        }

        for(int i = 0; i < arrayPoints.length; i++) {
            for (int j = 0; j < arrayPoints[i].length; j++) {
                System.out.print(arrayPoints[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxNumber);
    }
}
