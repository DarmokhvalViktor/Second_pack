package org.darmokhval.second_pack_of_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class TwoClosestPoints {

    public static void main(String[] args) {
        PointsInThreeCircles.Point point = new PointsInThreeCircles.Point();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of the points: ");
        int row = scan.nextInt();
        int columns = 2;
        double[][] arrayPoints = new double[row][columns];
        int arrayLen = arrayPoints.length;

        System.out.println("Enter coordinates for points: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < columns; j++) {
                arrayPoints[i][j] = scan.nextDouble();
            }
        }

        double minDistance = Double.POSITIVE_INFINITY;

        int indexFirstClosestPoint = 0;
        int indexSecondClosestPoint = 0;

        for(int i = 0; i < arrayLen; i++) {
            for(int j = 0; j < arrayLen; j++) {
                if (arrayPoints[j] == arrayPoints[i]) {
                    continue;
                }
                else {
                    double tempDist = point.Distance(arrayPoints[i][0], arrayPoints[i][1], arrayPoints[j][0], arrayPoints[j][1]);
                    if (tempDist <= minDistance) {
                        minDistance = tempDist;
                        indexFirstClosestPoint = i;
                        indexSecondClosestPoint = j;
                    }
                }
            }
        }

        String firstClosestPoint = Arrays.toString(arrayPoints[indexFirstClosestPoint]);
        String secondClosestPoint = Arrays.toString(arrayPoints[indexSecondClosestPoint]);

        System.out.println("Two closes points are: " + firstClosestPoint + " and " + secondClosestPoint);

    }
}
