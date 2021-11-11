package org.darmokhval.second_pack_of_tasks;

import java.util.Random;
import java.util.Scanner;

public class RandomMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of matrix: ");
        int size = scan.nextInt();

        int[][] matrix = randomMatrix(size);
        int[] tempArray = formTemporaryArray(matrix, size);
        int[][] finalMatrix = formFinalMatrix(tempArray, size);

        printResults(matrix, finalMatrix, size);
    }

    private static int[][] randomMatrix(int size) {
        Random rand = new Random();

        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(100 + 100) - 100;
            }
        }

        return matrix;
    }

    private static int[] formTemporaryArray(int[][] matrix, int size) {
        int[] tempArray = new int[size * size];
        int position = 0;
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(matrix[i][j] >= 0) {
                    tempArray[position] = matrix[i][j];
                    position++;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(matrix[i][j] < 0) {
                    tempArray[position] = matrix[i][j];
                    position++;
                }
            }
        }

        return tempArray;
    }

    private static int[][] formFinalMatrix(int[] tempArray, int size) {
        int[][] finalMatrix = new int[size][size];
        int count = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                finalMatrix[i][j] = tempArray[count];
                count++;
            }
        }
        return finalMatrix;
    }

    private static void printMatrix(int[][] matrix, int size) {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printResults(int[][] matrix, int[][] finalMatrix, int size) {
        System.out.println("Randomly created matrix: ");
        printMatrix(matrix, size);

        System.out.println();
        System.out.println("Final matrix: ");
        System.out.println();
        printMatrix(finalMatrix, size);
    }


}
