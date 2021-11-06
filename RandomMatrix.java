package org.darmokhval.second_pack_of_tasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter size of matrix: ");
        int row = scan.nextInt();
        int[][] array = new int[row][row];
        int arrayLen = array.length;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                array[i][j] = rand.nextInt(100 + 100) - 100;
            }
        }

        ArrayList<Integer> positiveArray = new ArrayList();
        ArrayList<Integer> negativeArray = new ArrayList();
        for (int i = 0; i < arrayLen; i++) {
            for(int j = 0; j < arrayLen; j++) {
                if(array[i][j] >= 0) {
                    positiveArray.add(array[i][j]);
                }
            }
        }
        for (int i = 0; i < arrayLen; i++) {
            for(int j = 0; j < arrayLen; j++) {
                if(array[i][j] < 0) {
                    negativeArray.add(array[i][j]);
                }
            }
        }


        int posLen = positiveArray.size();
        int negLen = negativeArray.size();
        int[] result = new int[posLen + negLen];
        int position = 0;

        for(int element: positiveArray) {
            result[position] = element;
            position++;
        }
        for(int element: negativeArray) {
            result[position] = element;
            position++;
        }

        int[][] finalArray = new int[row][row];
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                finalArray[i][j] = result[count];
                count++;
            }
        }
        System.out.println("Randomly created matrix: ");
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Final matrix: ");
        System.out.println();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(finalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
