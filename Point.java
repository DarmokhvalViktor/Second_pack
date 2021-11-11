package org.darmokhval.second_pack_of_tasks;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point otherPoint) {
        return Math.sqrt((this.x - otherPoint.x) * (this.x - otherPoint.x)
                + (this.y - otherPoint.y) * (this.y - otherPoint.y));
    }
}