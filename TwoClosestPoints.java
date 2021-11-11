package org.darmokhval.second_pack_of_tasks;

import java.util.Arrays;

public class TwoClosestPoints {

    public static void main(String[] args) {

        double[][] arrayOfPoints = {
                {0, 0},
                {5, 5},
                {17, 17},
                {25, 25},
                {40, 40},
                {60, 60},
                {70, 70},
                {105, 105},
                {140, 140},
                {200, 200}
        };

        Point[] points = new Point[10];

        for (int i = 0; i < 9; i++) {
            points[i] = new Point(arrayOfPoints[i][0], arrayOfPoints[i][1]);
        }
        double min = Double.POSITIVE_INFINITY;
        int firstClosestPoint = -1;
        int secondClosestPoint = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (points[i] == points[j]) {
                    continue;
                }
                if (points[i].distance(points[j]) < min) {
                    min = points[i].distance(points[j]);
                    firstClosestPoint = i;
                    secondClosestPoint = j;
                }
            }
        }
        System.out.println("First point: " + arrayOfPoints[firstClosestPoint][0] + ", "
                + arrayOfPoints[firstClosestPoint][1]);
        System.out.println("Second point: "  + arrayOfPoints[secondClosestPoint][0] + ", "
                + arrayOfPoints[secondClosestPoint][1]);

        System.out.println(points[firstClosestPoint]);
        System.out.println(min);
        System.out.println(Arrays.deepToString(arrayOfPoints));

    }
}
