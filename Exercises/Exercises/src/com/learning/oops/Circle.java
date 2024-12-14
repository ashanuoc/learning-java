/*
(i) Create a class Circle with the following field:
    radius (double)
(ii) Add the following methods:
    setRadius(double radius) to set the radius
    getArea() to calculate and return the area
    getCircumference() to calculate and return the circumference

(iii) Ensure the radius is a positive number. If a negative value is entered, default it to 1.
*/
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
