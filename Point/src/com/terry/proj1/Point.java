package com.terry.proj1;

public class Point {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        //return Math.sqrt(((x - 0)*(x - 0) + ((y - 0) * (y - 0))));
        return distance(0,0);
    }

    public double distance(int x1,int y1)
    {
        return Math.sqrt(((x - x1)*(x - x1) + ((y - y1) * (y - y1))));
    }
    public double distance(Point another)
    {
        return distance(another.getX(),another.getY());
        // return Math.sqrt(((x - another.getX())*(x - another.getX()) + ((y - another.getY()) * (y - another.getY()))));
    }
}
