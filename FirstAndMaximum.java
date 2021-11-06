package org.darmokhval.second_pack_of_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndMaximum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = scan.nextInt();

        System.out.println("Enter numbers of an array: ");
        int[] anArray = new int[size];
        int maxIndex = 0;
        int maxNumber = 0;

        for (int i = 0; i < size; i++) {
            int number = scan.nextInt();
            anArray[i] = number;
        }
        for (int j = 0; j < size; j++) {
            if (maxNumber < anArray[j]) {
                maxNumber = anArray[j];
                maxIndex = j;
            }
        }
        anArray[maxIndex] = anArray[0];
        anArray[0] = maxNumber;

        System.out.println(Arrays.toString(anArray));

    }
}
