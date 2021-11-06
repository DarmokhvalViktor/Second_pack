package org.darmokhval.second_pack_of_tasks;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of rows of the first matrix: ");
        int firstRow = scan.nextInt();
        System.out.println("Enter amount of columns of the first matrix: ");
        int firstColumn = scan.nextInt();
        int[][] firstMatrix = new int[firstRow][firstColumn];
        System.out.println("Enter the element of the first matrix: ");
        for(int i = 0; i < firstRow; i++) {
            for(int j = 0; j < firstColumn; j++) {
                firstMatrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter amount of rows of the second matrix (must be the same number as columns of the first matrix): ");
        int secondRow = scan.nextInt();
        System.out.println("Enter amount of columns of the second matrix: ");
        int secondColumn = scan.nextInt();
        int[][] secondMatrix = new int[secondRow][secondColumn];
        System.out.println("Enter the element of the second matrix: ");
        for(int i = 0; i < secondRow; i++) {
            for(int j = 0; j < secondColumn; j++) {
                secondMatrix[i][j] = scan.nextInt();
            }
        }
        int[][] finalMatrix = new int[firstRow][secondColumn];
        int sum = 0;
        for(int i = 0; i < firstRow; i++) {
            for(int j = 0; j < secondColumn; j++) {
                for(int k = 0; k < firstColumn; k++) {
                    sum = sum + firstMatrix[i][k] * secondMatrix[k][j];
                }
                finalMatrix[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("The result of multiplication two matrices is: ");
        for(int i = 0; i < firstRow; i++) {
            for(int j = 0; j < secondColumn; j++) {
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
