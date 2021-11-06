package org.darmokhval.second_pack_of_tasks;
import java.util.*;

public class PointsInThreeCircles {

    public static class Point {

        public double Distance(double x1, double y1, double x2, double y2) {
            double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            return distance;
        }
    }

    public static class Circle {

        public boolean Contains(double distance, double radius) {
            return distance <= radius;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter coordinates for center of the first circle: ");
        String[] input1 = scan.nextLine().split(" ");
        double xCircle1 = Double.parseDouble(input1[0]);
        double yCircle1 = Double.parseDouble(input1[1]);

        System.out.println("Enter radius of the first circle: ");
        String rad1 = scan.nextLine();
        double radius1 = Double.parseDouble(rad1);

        System.out.println("Enter coordinates for center of the second circle: ");
        String[] input2 = scan.nextLine().split(" ");
        double xCircle2 = Double.parseDouble(input2[0]);
        double yCircle2 = Double.parseDouble(input2[1]);

        System.out.println("Enter radius of the second circle: ");
        String rad2 = scan.nextLine();
        double radius2 = Double.parseDouble(rad2);

        System.out.println("Enter coordinates for center of the second circle: ");
        String[] input3 = scan.nextLine().split(" ");
        double xCircle3 = Double.parseDouble(input3[0]);
        double yCircle3 = Double.parseDouble(input3[1]);

        System.out.println("Enter radius of the second circle: ");
        String rad3 = scan.nextLine();
        double radius3 = Double.parseDouble(rad3);

        System.out.println("Enter amount of the points you want to calculate: ");
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

        Point point = new Point();
        Circle circle = new Circle();

        List<Integer> firstCircleContains = new ArrayList<>();
        List<Integer> secondCircleContains = new ArrayList<>();
        List<Integer> thirdCircleContains = new ArrayList<>();

        for (int i = 0; i < arrayLen; i++) {
            if (circle.Contains(point.Distance(arrayPoints[i][0], arrayPoints[i][1], xCircle1, yCircle1), radius1)){
                firstCircleContains.add(i);
            }
        }

        for (int i = 0; i < arrayLen; i++) {
            if (circle.Contains(point.Distance(arrayPoints[i][0], arrayPoints[i][1], xCircle2, yCircle2), radius2)){
                secondCircleContains.add(i);
            }
        }

        for (int i = 0; i < arrayLen; i++) {
            if (circle.Contains(point.Distance(arrayPoints[i][0], arrayPoints[i][1], xCircle3, yCircle3), radius3)){
                thirdCircleContains.add(i);
            }
        }

        Set setFirstCircleContains = new TreeSet(firstCircleContains);
        Set setSecondCircleContains = new TreeSet(secondCircleContains);
        Set setThirdCircleContains = new TreeSet(thirdCircleContains);

        setFirstCircleContains.retainAll(setSecondCircleContains);
        setFirstCircleContains.retainAll(setThirdCircleContains);

        Integer[] arrayOfCommons = new Integer[setFirstCircleContains.size()];
        setFirstCircleContains.toArray(arrayOfCommons);

        double[][] finalArray = new double[arrayOfCommons.length][2];

        for (int i = 0; i < arrayOfCommons.length; i++) {
            int x = arrayOfCommons[i];
            finalArray[i] = arrayPoints[x];
        }
        String common = Arrays.deepToString(finalArray);

        System.out.println("Points, which are contained simultaneously on all circles: " + common);

    }
}
