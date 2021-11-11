package org.darmokhval.second_pack_of_tasks;
import java.util.*;

public class PointsInThreeCircles {

    public static void main(String[] args) {

        double xCircle1 = 3.0;
        double yCircle1 = 2.0;
        double radius1 = 10.0;

        double xCircle2 = 5.0;
        double yCircle2 = 7.0;
        double radius2 = 13.0;

        double xCircle3 = 1.0;
        double yCircle3 = 2.0;
        double radius3 = 5.0;

        double[][] arrayOfPoints = {
                {0, 0},
                {0, 1},
                {3, 1},
                {4, 4},
                {7, 15},
                {20, 20},
                {17, 0},
                {3, 3},
                {5, 3},
                {9, 0}
        };

        Point[] points = new Point[10];
        for (int i = 0; i < 9; i++) {
            points[i] = new Point(arrayOfPoints[i][0], arrayOfPoints[i][1]);
        }
        Circle circle1 = new Circle(new Point(xCircle1, yCircle1), radius1);
        Circle circle2 = new Circle(new Point(xCircle2, yCircle2), radius2);
        Circle circle3 = new Circle(new Point(xCircle3, yCircle3), radius3);

        for (int i = 0; i < 9; i++) {
            if(circle1.containsPoint(points[i]) && circle2.containsPoint(points[i])
                    && circle3.containsPoint(points[i])) {
                System.out.print(Arrays.toString(arrayOfPoints[i]) + " ");
                // code below not working:
                // System.out.println(points[i]);
            }
        }
    }
}
