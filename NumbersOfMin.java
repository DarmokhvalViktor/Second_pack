package org.darmokhval.second_pack_of_tasks;

import java.util.Scanner;

public class NumbersOfMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter size of an array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter number: ");
        for (int i = 0; i < size; i++) {
            int number = scan.nextInt();
            array[i] = number;
        }
        for (int j = 0; j < array.length; j++) {
            boolean isLeftLarger = true;
            boolean isRightLarger = true;
            if (j > 0) {
                if (array[j-1] < array[j]){
                    isLeftLarger = false;
                }
            }
            if (j < array.length - 1) {
                if (array[j+1] < array[j]){
                    isRightLarger = false;
                }
            }
            if (isLeftLarger && isRightLarger) {
                count++;
            }
        }
        System.out.println(count);
    }
}
