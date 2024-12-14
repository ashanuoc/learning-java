package com.learning.oops;

public class Circle {
    private double radius = 1;
    final double PI = 3.14;

    public void setRadius(double radius){
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }

}
