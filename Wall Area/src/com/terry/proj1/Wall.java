package com.terry.proj1;

public class Wall {

    public static void main(String[] args) {
        Wall wall = new Wall(4,5);
        System.out.println(wall.getArea());
           }
    private double width;
    private double height;

    public Wall()
    {
this(0.0,0.0);
    }
    public Wall(double width, double height)
    {
        if (width<0)
            this.width=0;
        else
        this.width=width;
        if (height<0)
            this.height=0;
        else
        this.height=height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0)
            this.width=0;
        else
            this.width=width;    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

        public double getArea()
        {
            return (width*height);
        }
    }

